package com.mystore.base;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.ejb.BeforeCompletion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop ;
	public static WebDriver driver;
	@BeforeSuite
	
		public void loadConfig() {
//			ExtentManager.setExtent();
//			DOMConfigurator.configure("log4j.xml");

			try {                                            //read the property so we create a object class
				prop = new Properties();
				FileInputStream ip = new FileInputStream(
						System.getProperty("user.dir") + "\\Configuration\\config.properties");
				prop.load(ip);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			
		}
			
		}

	public static void launchApp() {
		WebDriverManager.chromedriver().setup();
		String browserName= prop.getProperty("browser"); 
		if(browserName.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browserName.contains("Firefox")) {
			driver=new FirefoxDriver();

		}
//	Action.implicitWait(driver, 10);
//	Action.pageloadtimeout(driver, 20);
		driver.get(prop.getProperty(""));
	


	}
}







































