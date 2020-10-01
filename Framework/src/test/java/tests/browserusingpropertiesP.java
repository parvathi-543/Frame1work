package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import Demo.Log4j;
import config.PropertiesfileP;

public class browserusingpropertiesP {
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	WebDriver driver;
	ExtentTest test;
	public static String browsername=null;
	private static Logger logger =LogManager.getLogger(Demo.Log4j.class);
	
	@BeforeSuite
	public void setup() {
		htmlreporter = new ExtentHtmlReporter("paru.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter); 
	}
	@BeforeTest
	public void setuptest() throws IOException {
		PropertiesfileP.getproperty();
		String projectpath=System.getProperty("user.dir");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", projectpath+"//Drivers//geckodriver//geckodriver.exe");
			WebDriver driver = new FirefoxDriver();	
			driver.manage().window().maximize();

		}
		else if(browsername.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", projectpath+"//Drivers//IEdriver//IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();	
			driver.manage().window().maximize();

		}
		else {
			System.out.println("no browser");
		}
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
	}
		@AfterTest
		public void closingapp() throws IOException {
			driver.close();
			test.pass("closed the browser");
			test.log(Status.INFO, "This step shows usage of log(status, details)");
			test.info("test completed");
			System.out.println("test completed");
			PropertiesfileP.setproperty();
		}

		@AfterSuite
		public void teardown() {
			// calling flush writes everything to the log file
			extent.flush();
		}
	}
