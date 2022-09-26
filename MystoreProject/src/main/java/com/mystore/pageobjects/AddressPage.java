/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author pooja
 *
 */
public class AddressPage extends BaseClass
{
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	WebElement proceedToCheckout;
	
	public  AddressPage() {       //call constructor same as a class name
		PageFactory.initElements(driver, this);
	}
	public ShippingPage clickOnCheckout() {
		Action.click(driver, proceedToCheckout);
		return new ShippingPage();
	}
}
