package com.automation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class RadioButtonsTest
{
       public static void main (String args[])
       {
    	   ChromeDriverManager.chromedriver().setup();
    	    WebDriver driver = new ChromeDriver();
              driver.get("http://sites.ecanarys.com/Nopcommercesite/");
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              driver.findElement(By.linkText("Register")).click();
              WebElement maleRadioBtn = driver.findElement(By.id("gender-male"));
              boolean radioBtnIsDisplayed = maleRadioBtn.isDisplayed();
              System.out.println("Is Male radio button displayed: "+radioBtnIsDisplayed);
              boolean radioBtnIsEnabled = maleRadioBtn.isEnabled();
              System.out.println("Is Male radio button enabled: "+radioBtnIsEnabled);
              boolean radioBtnIsSelected = maleRadioBtn.isSelected();
              System.out.println("Default Radio button selection Status: "+radioBtnIsSelected);
              maleRadioBtn.click();
              boolean radioBtnNewSelectionStatus = maleRadioBtn.isSelected();
              System.out.println("Male radio Selection status after perform click() event: "+radioBtnNewSelectionStatus);
              driver.quit();
       }
}