package com.markandspencers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	WebElement search_Element;
	WebElement performSearch;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void search() throws InterruptedException{
		//Thread.sleep(5000);
		search_Element = driver.findElement(By.xpath(".//input[@id='global-search']"));
		search_Element.sendKeys("jackets");
	}
	
	public void goAndSearch() throws InterruptedException{
		//Thread.sleep(5000);
		performSearch = driver.findElement(By.xpath(".//input[@id='goButton']"));
		performSearch.click();
	}
}
