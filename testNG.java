package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG {
    WebDriver driver ;
    @Test
    public void f() {
	   String baseUrl = "https://cdta-staging.gfcp.io";
	   System.out.println("Launching Google Chrome browser"); 
	   driver = new ChromeDriver();
	   driver.get(baseUrl);
	   String testTitle = "Free QA Automation Tools For Everyone";
	   String originalTitle = driver.getTitle();
	   Assert.assertEquals(originalTitle, testTitle);
   }
	
   @BeforeMethod
    public void beforeMethod() {
	System.out.println("Starting Test On Chrome Browser");
    }
	
    @AfterMethod
     public void afterMethod() {
	 driver.close();
	 System.out.println("Finished Test On Chrome Browser");
    }
}
