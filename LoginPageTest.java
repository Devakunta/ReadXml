package com.automation.testcases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.automation.AppConfig;
import com.automation.pages.LoginPage;

@Test
@ContextConfiguration(classes = AppConfig.class)
public class LoginPageTest extends AbstractTestNGSpringContextTests  {

	
	@Autowired
	LoginPage loginpage;
	
	@Test
	public void test_success()
	{
		//loginpage= new LoginPage(driver);
		loginpage.loadWebSite("https://cdta-staging.gfcp.io");
		loginpage.typeEmailId("devraghavendra9550@gmail.com");
		loginpage.typePassword("9550415188");
		loginpage.clickSignIn();
		loginpage.clicknew();
		loginpage.clicknewcustomer();
		loginpage.clickPrei();
		loginpage.typeFirstName("Devakunta");
		loginpage.typeLname("Raghava");
		loginpage.typeMi("ra");
		loginpage.typeId("234");
		loginpage.notes("hello");
		loginpage.getFareType().click();
		loginpage.getAccountType().click();
		loginpage.create();
		loginpage.addLine1("hyderabad");
		loginpage.addLine2("kurnool");
		loginpage.city("hyderabad");
		loginpage.state("Telangana");
		loginpage.zipCode("518221");
		loginpage.primaryPhone("8768594758");
		loginpage.secondaryPhone("9876543456");
		loginpage.dateofbirth("10-07-1998");
		loginpage.nextClick();
	}
}
