package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramLogInPage {
	
	DriverInstall system;
	public FramLogInPage(DriverInstall system) {
		this.system = system ;
	}
	public WebElement ifram() {
		WebElement ifrm = system.getDriver().findElement(By.id("firstFr"));
		return ifrm;
	}
	
	public WebElement Uname() {
		WebElement name = system.getDriver().findElement(By.name("fname"));
		return name;

	}
	public WebElement lname() {
		WebElement lname = system.getDriver().findElement(By.name("lname"));
		return lname;

	}
	public WebElement fname() {
		WebElement wname = system.getDriver().findElement(By.name("fname"));
		return wname;

	}

}
