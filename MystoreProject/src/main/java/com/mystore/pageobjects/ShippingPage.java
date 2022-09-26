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
public class ShippingPage  extends BaseClass
{
	@FindBy(id = "cgv")
	WebElement terms;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	WebElement proceedToCheckout;

	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnTerms() {
		Action.click(driver, terms);
	}
	public PaymentPage clickOnProceedToCeckout() {
		Action.click(driver, proceedToCheckout);
		return new PaymentPage();
		
	}
}
