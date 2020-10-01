package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
public static void main(String[] args) {
	String projectpath=System.getProperty("user.dir");
	System.out.println(projectpath);
	//System.setProperty("webdriver.gecko.driver", projectpath+"//Drivers//geckodriver//geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			// System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//chromedriver//chromedriver.exe");
			// WebDriver driver = new ChromeDriver();
			// System.setProperty("webdriver.ie.driver", projectpath+"//Drivers//IEdriver//IEDriverServer.exe");
			 //WebDriver driver = new InternetExplorerDriver();
	
}
}
