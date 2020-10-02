package pack1;
//Sample test in Java to run Automate session.
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
public class BrowserStack {
public static final String AUTOMATE_USERNAME = "javvadiparvathid2";
public static final String AUTOMATE_ACCESS_KEY = "mHKP8EvotWqMVdjzmUx5";
public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
public static void main(String[] args) throws Exception {
 DesiredCapabilities caps = new DesiredCapabilities();
 caps.setCapability("os", "Windows");
 caps.setCapability("os_version", "10");
 caps.setCapability("browser", "Chrome");
 caps.setCapability("browser_version", "81.0");
 caps.setCapability("project", "paru");
 caps.setCapability("build", "3.0");
 caps.setCapability("name", "javvadi");
 caps.setCapability("browserstack.local", "false");
 caps.setCapability("browserstack.networkLogs", "true");
 caps.setCapability("browserstack.selenium_version", "3.14.0"); // CI/CD job or build name
 WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
 driver.get("https://www.google.com");
 WebElement element = driver.findElement(By.name("q"));
 element.sendKeys("BrowserStack");
 element.submit();
 System.out.println(driver.getTitle());
 driver.quit();
}
} 