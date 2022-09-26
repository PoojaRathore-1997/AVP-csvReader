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
public class OrderPage  extends BaseClass
{
  @FindBy(xpath = "//td[@class='cart_unit']/span/span")
  WebElement unitPrice;
  
  @FindBy(id = "total_price")
  WebElement totalPrice;
  
  @FindBy(xpath = "//span[text()='Proceed to checkout']")
  WebElement proceedToCheckout;
  
  public OrderPage() {
	  PageFactory.initElements(driver, this);
	  
  }
  public double getUnitPrice() {
	  unitPrice.getText();
	  String unitPrice1=unitPrice.getText();
	 String unit= unitPrice1.replaceAll("[^a-zA-Z0-9]", "");
	 Double finalunitPrice=Double.parseDouble(unit);
	 return finalunitPrice/100;
  }
  
  public double getTotalPrice() {
	  unitPrice.getText();
	  String totalPrice1=unitPrice.getText();
	 String total= totalPrice1.replaceAll("[^a-zA-Z0-9]", "");
	 Double finaltotalPrice=Double.parseDouble(total);
	 return finaltotalPrice/100;
  }
  public LoginPage clickOnCheckout() {
	  Action.click(driver, proceedToCheckout);
	  return new LoginPage();
  }
}
