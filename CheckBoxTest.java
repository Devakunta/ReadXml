package com.automation.testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
public class CheckBoxTest {
       public static void main(String args[])
       {
    	   ChromeDriverManager.chromedriver().setup();
   	    WebDriver driver = new ChromeDriver();
              driver.get("http://sites.ecanarys.com/Nopcommercesite");
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              driver.findElement(By.linkText("Register")).click();
              WebElement tcCheckbox = driver.findElement(By.id("accept-privacy-policy"));
              boolean tcCheckIsDisplayed = tcCheckbox.isDisplayed();
              System.out.println("Is Terms and condition checkbox displayed: "+tcCheckIsDisplayed);
              boolean tcCheckboxIsEnabled = tcCheckbox.isEnabled();
              System.out.println("Is Terms and condition checkbox enabled: "+tcCheckboxIsEnabled);
              boolean tcCheckboxIsSelected = tcCheckbox.isSelected();
              System.out.println("Default Terms and Condition checkbox status: "+tcCheckboxIsSelected);       
              tcCheckbox.click();
              boolean tcCheckboxNewStatus = tcCheckbox.isSelected();
              System.out.println("Terms and Condition checkbox status after perform click() event: "+tcCheckboxNewStatus);
              driver.quit();
       }
}
