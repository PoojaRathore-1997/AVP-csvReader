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
public class AddToCartPage extends BaseClass
{
   @FindBy(id = "quantity_wanted")
   WebElement quantity;
   
   @FindBy(name = "group_1")
   WebElement size;
   
   @FindBy(id = "//*[@id=\"add_to_cart\"]/button/span")
   WebElement addToCartBtn;
   
   @FindBy(xpath = "//*[@id=\"layer_cart\"]//h2/i")
   WebElement addTOCartMessage;
   @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
   WebElement proceedToCeckoutBtn;
   
   
   public AddToCartPage() {
	   PageFactory.initElements(driver, this);
	   
   }
   
   public void enterQuantity(String quantity1) {
	   Action.type(quantity, quantity1);
	      }
   public void selectSize(String size1) {
	   Action.selectByVisibleText(size,size1);
   }
   public void clickOnaddToCart() {
	   Action.click(driver, addToCartBtn);
   }
   
   public void validateaddToCart() {
	   Action.isDisplayed(driver, addTOCartMessage);
   }
   
   public OrderPage clickOnCheckout() throws Exception {
	   Action.JSClick(driver, proceedToCeckoutBtn);
	   return new OrderPage();
   }
}
