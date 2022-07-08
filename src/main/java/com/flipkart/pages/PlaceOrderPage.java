package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class PlaceOrderPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	By placeorder = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button/span");
	
	public void validatePlaceOrder() {
		wait(2000);
		driver.findElement(placeorder).click();
		
	}
}
