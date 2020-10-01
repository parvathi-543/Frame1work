package utilitys;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Exceldataprovider {
WebDriver driver;	
	@BeforeTest
	public void setuptest() throws IOException {
		String projectpath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	
	
	
	
@Test(dataProvider ="testdata1")
public void test1(String username,String password,String empid) throws InterruptedException {
	System.out.println(username+" | "+password+" | "+empid);
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	Thread.sleep(3000);
	
}
	
@DataProvider(name="testdata1")
public Object[][] getData() {
	String excelpath="D:\\ECLIPSE WORKSPACE\\Framework\\Excel sheet\\data.xlsx";	
	Object data[][]= testdata(excelpath,"Sheet1");
	return data;
}
	public static Object[][] testdata(String excelpath,String sheetname) {
		Utils2frameworkstyleQ excel=new Utils2frameworkstyleQ(excelpath,sheetname);	
		int rowcount=excel.getRowCount();
		int colcount=excel.getcolCount();
		Object data[][]=new Object[rowcount-1][colcount];
for(int i=1;i<rowcount;i++) {
	for(int j=0;j<colcount;j++) {
		String cellData=excel.getColCount(i, j);
		//System.out.println(cellData+"   ");
		data[i-1][j]=cellData;
	}
//System.out.println();
}
return data;
	}

}
