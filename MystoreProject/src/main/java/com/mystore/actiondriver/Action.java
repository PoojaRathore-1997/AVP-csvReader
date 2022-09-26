package com.mystore.actiondriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mystore.base.BaseClass;

public class Action extends BaseClass {

	
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {    //return 1 method we can reuse again
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}

	public static  void click(WebDriver driver, WebElement  locatorName) {

		Actions act = new Actions(driver);
		act.moveToElement(locatorName).click().build().perform();

	}

	public boolean findElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag = true;
		} catch (Exception e) {
			// System.out.println("Location not found: "+locatorName);
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully Found element at");

			} else {
				System.out.println("Unable to locate element at");
			}
		}
		return flag;
	}
	//diplay element

	public static boolean isDisplayed(WebDriver driver, WebElement mystorelogo) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void type(WebElement searchBox, String productName) {
		// TODO Auto-generated method stub
		
	}

	public static void selectByVisibleText(WebElement size, String size1) {
		// TODO Auto-generated method stub
		
	}

	

	public static void JSClick(WebDriver driver, WebElement proceedToCeckoutBtn) {
		// TODO Auto-generated method stub
		
	}



//	public static boolean JSClick(WebDriver driver, WebElement ele) throws Exception {
//		boolean flag = false;
//		try {
//			// WebElement element = driver.findElement(locator);
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click();", ele);
//			// driver.executeAsyncScript("arguments[0].click();", element);
//
//			flag = true;
//
//		}
//
//		catch (Exception e) {
//			throw e;
//
//		} finally {
//			if (flag) {
//				System.out.println("Click Action is performed");
//			} else if (!flag) {
//				System.out.println("Click Action is not performed");
//			}
//		}
//		return flag;
//	}

	

	

	

	
	
	}

	

