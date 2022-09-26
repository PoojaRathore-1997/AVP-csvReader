/**
 * 
 */
package com.mystore.testcases;

import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;

/**
 * @author pooja
 *
 */
public class IndexPageTest extends BaseClass
{
	IndexPage indexPage;

	@BeforeMethod
  public void setup() {
		launchApp();
	  
  }
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void verifyLogo() {
		 indexPage= new IndexPage();
		boolean result= indexPage.validateLogo();
		Assert.assertTrue(result);
	}
	@Test
	public void verifyTitle() {
		String acttitle=indexPage.getMyStoreTitle();
		Assert.assertEquals(acttitle, "My Store");
	}
}
