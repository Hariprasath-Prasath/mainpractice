package hooks.corg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverInstall;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks {
	
	DriverInstall system;
	public Hooks(DriverInstall system) {
		this.system = system;
	}
	
	@Before
	public void before(Scenario Scenario) {
		WebDriver driver = new ChromeDriver();
		system.setDriver(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		system.setWait(wait);
		system.getDriver().manage().window().maximize();
		system.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		system.getDriver().get("https://letcode.in/frame");
		System.out.println(Scenario.getUri());

	}
	@After
	public void after(Scenario Scenario) {
		Status status = Scenario.getStatus();
		System.out.println("Status : "+status);
		system.getDriver().quit();

	}

}
