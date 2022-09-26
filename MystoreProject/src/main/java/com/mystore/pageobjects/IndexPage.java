package com.mystore.pageobjects;

import javax.persistence.Id;
import javax.persistence.IdClass;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass
{
	@FindBy(xpath = "//a[@class=\"login\"]")
	WebElement signInBtn;
	
	@FindBy(xpath = "//img[@class=\"logo img-responsive\"]")
	WebElement mystorelogo;
	@FindBy(id ="search_query_top")
	WebElement searchBox;
	@FindBy(name = "submit_search")
	WebElement searchBtn;
	
	public  IndexPage() {       //call constructor same as a class name
		PageFactory.initElements(driver(), this);
		
	}
	private SearchContext driver() {
		// TODO Auto-generated method stub
		return null;
	}
	public LoginPage clickOnSignIn() {
		Action action = new Action();
		action.click(driver, signInBtn);
		return new LoginPage();
	}
	public  boolean validateLogo () {
		return Action.isDisplayed(driver,mystorelogo);
	}
	public String getMyStoreTitle() {
		String myStoreTitle= driver.getTitle();
		return myStoreTitle;
		
	}
	public  SearchResultPage searchProduct(String productName)  {
		Action.type(searchBox, productName);
		Action.click(driver,searchBtn);
	return new SearchResultPage();
		
	}

}
