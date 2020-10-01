package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportswithtestNG {
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	WebDriver driver;
	ExtentTest test;
	@BeforeSuite
	public void setup() {
		htmlreporter = new ExtentHtmlReporter("paru.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter); 

	}
	@BeforeTest
	public void setuptest() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//chromedriver//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception {
		// creates a toggle for the given test, adds all log events under it    
		 test = extent.createTest("MyFirstTest", "Sample description");
		driver.get("https://www.hubspot.com/products/crm");
		test.pass("navigated to home page");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		driver.findElement(By.xpath("//span[@class='hsg-nav__link-label']")).click();
		test.pass("pressed software");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		driver.findElement(By.xpath("//div[@class='hsg-nav__header-container']")).click();
		test.pass("passed data key");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		
		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("paru.png");

	}
	@AfterTest
	public void closingapp() {
		driver.close();
		test.pass("closed the browser");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("test completed");
	}

	@AfterSuite
	public void teardown() {
		// calling flush writes everything to the log file
		extent.flush();
	}

}

