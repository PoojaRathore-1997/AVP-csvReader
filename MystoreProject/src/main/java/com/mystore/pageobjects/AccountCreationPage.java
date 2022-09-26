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
public class AccountCreationPage extends BaseClass
{
@FindBy(xpath = "//h1[text()='Create an account']")
WebElement formTitle;


 public AccountCreationPage() {                        //initilize all object using pagefactory method
	PageFactory.initElements(driver, this);
}
 
 public boolean validateAccountCreatePage() {
	return  Action.isDisplayed(driver, formTitle);
	
 }
}
