package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.browser;
import pom.HomePage;

public class challane {
	WebDriver driver;
	
	@BeforeMethod
	public void browserOpen() {
		driver=browser.openBrowser("https://www.tendable.com/");
	}
	@Test
	public void accessMenu() {
		HomePage homepage=new HomePage(driver);
		boolean status=homepage.homeTend();
		boolean status1=homepage.ourstory();
		boolean status2=homepage.oursolution();
		boolean status3=homepage.whytendable();
		SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(status);
        softAssert.assertTrue(status1);
        softAssert.assertTrue(status2);
        softAssert.assertTrue(status3);
        softAssert.assertAll();
	}
	@Test
	public void verifyRequestDemoButton() {
		HomePage homepage=new HomePage(driver);
		boolean status=homepage.homeTendrdemo();
		boolean status1=homepage.ourstoryrdemo();
		boolean status2=homepage.oursolutionrdemo();
		boolean status3=homepage.whytendablerdemo();
		SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(status);
        softAssert.assertTrue(status1);
        softAssert.assertTrue(status2);
        softAssert.assertTrue(status3);
        softAssert.assertAll();
	}
	@Test
	public void errormsg() {
		HomePage homepage=new HomePage(driver);
		homepage.fillform();
		boolean status=homepage.errormsg();
		SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(status);
        softAssert.assertAll();
	}

}
