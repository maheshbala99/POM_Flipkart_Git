package com.flipkart.testscenarios;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.AddToCartPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.PlaceOrderPage;
import com.flipkart.pages.SearchProductPage;
import com.flipkart.pages.SelectProductPage;

public class PlaceOrder extends TestBase {
	@BeforeClass
	public void setUp() {
		launchBrowser();
		navigateToURL();
	}

	@AfterClass
	public void tearDown() {
	}
	
	@Test(priority = 1)
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("8555077310", "mahesh@145");
		Assert.assertTrue(actResult);
	}

	
	@Test(priority = 2)
	public void seachProductTest() {
		SearchProductPage searchProductPage = new SearchProductPage();
		boolean actResult = searchProductPage.validateSearchProduct("laptop");
		Assert.assertTrue(actResult); //true or flase
		
	}
	
	@Test(priority = 3)
	public void selectProductTest() {
		SelectProductPage selectProductPage = new SelectProductPage();
		boolean actResult = selectProductPage.validateSelectProduct();
		Assert.assertTrue(actResult);
		//System.out.println("Title in select product: " + driver.getTitle());
	}
	
	@Test(priority = 4)
	public void addToCartTest() {
		AddToCartPage addToCartPage = new AddToCartPage();
		addToCartPage.validateAddToCart();
	}
	
	@Test(priority = 5)
	public void placeOrderTest() {
		PlaceOrderPage placeOrder = new PlaceOrderPage();
		placeOrder.validatePlaceOrder();
	}
	
	@Test
	public void makePayment() {
	}
	
	@Test
	public void logoutTest() {
	}

}
