package com.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class BasicFormTest {
	
    public static void main(String[] args){
        //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    	ChromeDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
        // Open URL
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("Raghava");
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Devakunta");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-4")).click();
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
        WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
        dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();
        // Scroll Vertical
        //js.executeScript("window.scrollTo(0,675.5555419921875)");
        // Click Submit
        driver.findElement(By.id("submit")).click();
  }
}
