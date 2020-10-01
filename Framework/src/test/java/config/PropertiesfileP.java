package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import tests.browserusingpropertiesP;

public class PropertiesfileP {
	static String projectpath=System.getProperty("user.dir");
	public static void main(String[] args) throws IOException {

		getproperty();
		setproperty();
		getproperty();
	}
	public static void getproperty() throws IOException {

		try {
			Properties prop=new Properties();

			InputStream input=new FileInputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			browserusingpropertiesP.browsername=browser;
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setproperty() throws IOException {
		Properties prop=new Properties();
		try {
			OutputStream output=new FileOutputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
			prop.setProperty("result", "pass");
			prop.store(output,null);
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}
}
