package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.crmPageobj;

public class CRM {
static WebDriver driver= null;
@BeforeTest
public void setup() {
	String projectpath=System.getProperty("user.dir");
	 System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//chromedriver//chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
}
@Test
public static void testtt() {	
	
crmPageobj obj=new crmPageobj(driver);
driver.get("https://www.hubspot.com/products/crm");
obj.signup("keys.RETURN");
obj.usinggoogle();
obj.gmail();
}
@BeforeTest
public void teardown() {
	
driver.close();
System.out.println("execution succesfully completed");
	}}

