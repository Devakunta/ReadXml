package com.automation.testcases;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PDFDownload {
	WebDriver driver = null;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghavendra\\Downloads\\Driver\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
	}
	@Test
	public void downloadPdf() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.learningcontainer.com/sample-pdf-files-for-testing");
	driver.findElement(By.xpath("//*[@id=\"bfd-single-download-810\"]/div/div[2]/a/p[1]/strong")).click();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
