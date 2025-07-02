	package stepDefen;
	
	import org.openqa.selenium.WebElement;

import driver.DriverInstall;
import driver.FramLogInPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
	
	public class FrameStepDefen {
	
		DriverInstall system;
		public FrameStepDefen(DriverInstall system) {
			this.system = system;
		}
	
		@When("User Switch to the frame")
		public void userSwitchToTheFrame() {
			FramLogInPage FLP = new FramLogInPage(system);
			WebElement ifm = FLP.ifram();
			system.getDriver().switchTo().frame(ifm);
	
		}
		@When("User ender {string}")
		public void userEnder(String name1) {
			FramLogInPage FLP = new FramLogInPage(system);
			FLP.Uname().sendKeys(name1);
		
		}
		@When("User Enter {string}")
		public void userEnter(String name2) {
			FramLogInPage FLP = new FramLogInPage(system);
			FLP.lname().sendKeys("T");
		}
	
		@Then("User switch back to the default content")
		public void userSwitchBackToTheDefaultContent() {
			system.getDriver().switchTo().defaultContent();
	
		}
	
		@When("User Enter frame {string}")
		public void userEnterFrame(String name3) {
			try {
				FramLogInPage FLP = new FramLogInPage(system);
				FLP.fname().sendKeys(name3);
			}catch(Exception e){
				System.out.println(e);
			} finally {
				System.out.println("Exceptio handiled");
			}

		}

		@When("User send messege {string} user switch to frams")
		public void userSendMessegeUserSwitchToFrams(String errMeg) {
		    	System.out.println(errMeg);
		   
		}

		@When("User switch to the outer frame")
		public void userSwitchToTheOuterFrame() {
			FramLogInPage FLP = new FramLogInPage(system);
			WebElement ifm = FLP.ifram();
			system.getDriver().switchTo().frame(ifm);
		   
		}
		@When("User switch to the inner frame")
		public void userSwitchToTheInnerFrame() {
			FramLogInPage FLP = new FramLogInPage(system);
			WebElement infrm = FLP.infram();
			system.getDriver().switchTo().frame(infrm);
		   
		}
		@When("I enter {string} into the input field")
		public void iEnterIntoTheInputField(String mail) {
			FramLogInPage FLP = new FramLogInPage(system);
			FLP.secondFramkey().sendKeys(mail);
		   
		}
		@Then("send message {string} in sysout")
		public void sendMessageInSysout(String key) {
		    System.out.println(key);
		   
		}
	
	}
