package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsgeneration {
	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter;
		ExtentReports extent;
		ExtentTest test1;
		// start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 test1 = extent.createTest("MyFirstTest", "Sample description");
		test1.log(Status.INFO,"starting testcase");
		driver.get("");
		test1.pass("navigated tohome page");
		driver.findElement(By.xpath("//input[[@id='paru'])")).click();
		test1.pass("pressed key");
		driver.findElement(By.xpath("//input[[@id='paru'])")).click();
		test1.pass("passed data key");
		driver.close();
		test1.pass("closed the browser");
		test1.info("test completed");
		extent.flush();

	}}
