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
	public static void main(String args[])
	{
		LandingPage myPageRef = new LandingPage();
		
		WebDriver webDriver = myPageRef.getDriverHandle("https://github.com/");
		
		//Browser Commands
		System.out.println("Title was "+webDriver.getTitle());
		System.out.println("CurrentURL was "+webDriver.getCurrentUrl());
		//System.out.println("PageSource was "+webDriver.getPageSource());
		
		//Navigational Commands
		//System.out.println("Going to click Todays Deals");
		//webDriver.findElement(By.linkText("Today's Deals")).click();
		
		WebElement searchBox= webDriver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[1]"));
		//Click on the searchBox
		searchBox.click();
		WebElement searchBox1= webDriver.findElement(By.id("login_field"));
		searchBox1.click();
		searchBox1.sendKeys("karthi.raja006@gmail.com");
		WebElement searchBox2= webDriver.findElement(By.id("password"));
		searchBox2.click();
		searchBox2.sendKeys("karthi.raja006@gmail.com");
		webDriver.findElement(By.name("commit")).click();
		webDriver.findElement(By.xpath("//*[@id='your_repos']/div/div[2]/ul/li/a/span/span")).click();
		webDriver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[5]/details/summary")).click();
		webDriver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[5]/details/div/div/div[3]/a[2]")).click();
		webDriver.navigate().refresh();
		//webDriver.findElement(By.xpath("//*[@id='user-links']/li[3]/details/summary/img")).click();
		//webDriver.findElement(By.xpath("//*[@id='user-links']/li[3]/details/ul/li[9]/form/button")).click();
	}
	
}
