package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desired_Capabilities {

	public static void main(String[] args) throws InterruptedException {
		String projectpath=System.getProperty("user.dir");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings",true);
		System.setProperty("webdriver.ie.driver", projectpath+"//Drivers//IEdriver//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		driver.findElement(By.linkText("Selenium")).click();
		driver.close();
	}

}
