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
public class HomePage extends BaseClass
{
@FindBy(xpath = "//span[text()='My wishlists']")
WebElement myWishList;

@FindBy(xpath = "//span[text()='Order history and details']")
WebElement myOrderHistroy;

public HomePage() {
	PageFactory.initElements(driver,this);
}
public boolean validateMyWishlist() {
	return Action.isDisplayed(driver, myWishList);
}
public boolean validateOrderHistory() {
	return Action.isDisplayed(driver, myOrderHistroy);
}
}
