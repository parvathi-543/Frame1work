package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class crmPageobj{

	WebDriver driver= null;

		By first =By.linkText("Log in");
		By second =By.linkText("Sign in with Google");
		By third =By.linkText("Parvathi Devi");
		
		
		public crmPageobj(WebDriver driver1) {
			this.driver=driver1;
		}
		public void signup(String text) {
			driver.findElement(first).sendKeys("text");
		}
		public void usinggoogle() {
			driver.findElement(second).sendKeys("keys.RETURN");
		}	
		public void gmail() {
			driver.findElement(third).sendKeys("keys.RETURN");
		}
}


