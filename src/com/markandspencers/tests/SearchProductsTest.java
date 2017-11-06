package com.markandspencers.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.markandspencers.pages.HomePage;

public class SearchProductsTest {

	WebDriver driver;
	HomePage HomePageInstance;
	
	@BeforeTest()
	public void initiate(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.marksandspencer.com/");
	}
	
	@Test(priority=1)
	public void searchItem() throws InterruptedException{
		HomePageInstance = new HomePage(driver);
		HomePageInstance.search();
		//Thread.sleep(5000);
		HomePageInstance.goAndSearch();
	}
}
