package com.automation.Amazon;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LandingPage {

	WebDriver pageUnderTest = null;
	
	
	public WebDriver getDriverHandle(String stringWebSiteURL)
	{
		String exePath = "D:\\DevOps\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe";
		ChromeDriverService.Builder serviceBuilder = new ChromeDriverService.Builder();
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		serviceBuilder.withLogFile(new File("D:\\DevOps\\Downloads\\Selenium\\logs\\logFile.txt"));
		driver.get(stringWebSiteURL);
		this.pageUnderTest=driver;
		return driver;
	}
	public static void main(String args[]) throws InterruptedException
	{
		LandingPage myPageRef = new LandingPage();
		
		WebDriver webDriver = myPageRef.getDriverHandle("https://www.google.co.in/");
		
		//Browser Commands
		System.out.println("Title was "+webDriver.getTitle());
		System.out.println("CurrentURL was "+webDriver.getCurrentUrl());
		//System.out.println("PageSource was "+webDriver.getPageSource());
		
		//Navigational Commands
		//System.out.println("Going to click Todays Deals");
		//webDriver.findElement(By.linkText("Today's Deals")).click();
		
		WebElement searchBox= webDriver.findElement(By.id("lst-ib"));
		//Click on the searchBox
		searchBox.click();
		searchBox.sendKeys("Selenium");
		//       //*[@id="nav-search"]/form/div[2]/div/input
		WebElement searchButton= webDriver.findElement(By.name("btnK"));
		//*[@id="nav-search"]/form/div[2]/div/input
		//Click on the searchBox
		searchButton.click();
		Thread.sleep(5000);
		 webDriver.navigate().back();
		 webDriver.navigate().to("http://toolsqa.com/selenium-webdriver/browser-navigation-commands/");
	}
	
}
