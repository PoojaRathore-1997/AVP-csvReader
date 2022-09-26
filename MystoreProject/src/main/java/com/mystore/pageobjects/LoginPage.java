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
public class LoginPage extends BaseClass
{
	@FindBy(id = "email")
	WebElement username;
	@FindBy(name = "passwd")
	WebElement password;
	@FindBy(id  ="SubmitLogin")
	WebElement signInBtn;
	
	@FindBy(name = "email_create")
	WebElement emailForNewAccount;
	
	@FindBy(name = "SubmitCreate")
	WebElement createNewAccountBtn;
	
	public  LoginPage() {       //call constructor same as a class name
		PageFactory.initElements(driver, this);
	}
	public HomePage login(String uname,String pswd) 
	{
		Action.type(username, uname);
		Action.type(password, pswd);
		Action.click(driver, signInBtn);
		return new HomePage();
	}
	
	public AccountCreationPage createNewAccount(String newEmail) {
		Action.type(emailForNewAccount, newEmail);
		return new AccountCreationPage();
		
	}
	
	
	
}
