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
public class SearchResultPage extends BaseClass {
	@FindBy(xpath = "//*[@id=\"center_column\"]//img")
	WebElement productResults;
	
public SearchResultPage() {
	PageFactory.initElements(driver, this);
}
public boolean isproductAvailable() {
	return Action.isDisplayed(driver, productResults);
}
public AddToCartPage clickOnProducts() {
	Action.isDisplayed(driver, productResults);
	return new AddToCartPage();
}

}
