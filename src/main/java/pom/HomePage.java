package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	@FindBy(xpath="//a[@class='logo']")private WebElement home;
	@FindBy(xpath="//a[text()='Our Story']")private WebElement ourStory;
	@FindBy(xpath="//a[text()='Our Solution']")private WebElement ourSolution;
	@FindBy(xpath="//a[text()='Why Tendable?']")private WebElement whyTendable;
	@FindBy(xpath="//a[text()='Request A Demo']")private WebElement requestDemohp;
	@FindBy(xpath="(//a[text()='Request A Demo'])[1]")private WebElement requestDemopg;
	@FindBy(xpath="//a[text()='Contact Us']")private WebElement contactUs;
	@FindBy(xpath="(//button[text()='Contact'])[1]")private WebElement marketing;
	@FindBy(xpath="(//input[@id='form-input-fullName'])[1]")private WebElement fullName;
	@FindBy(xpath="id=\"form-input-organisationName\"")private WebElement orgName;
	@FindBy(xpath="(//input[@id=\"form-input-cellPhone\"])[1]")private WebElement phoneNo;
	@FindBy(xpath="(//input[@id=\"form-input-email\"])[1]")private WebElement email;
	@FindBy(xpath="(//select[@id=\"form-input-jobRole\"])[1]")private WebElement jobRole;
	@FindBy(xpath="(//input[@id=\"form-input-consentAgreed-0\"])[1]")private WebElement agree;
	@FindBy(xpath="(//button[text()='Submit'])[1]")private WebElement submit;
	@FindBy(xpath="//p[text()='Sorry, there was an error submitting the form. Please try again.']")private WebElement errorMsg;
		
	
	 public  HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	 public boolean homeTend()
	 {
		 return home.isEnabled();
	 }
	 public boolean ourstory()
	 {
		 return ourStory.isEnabled();
	 }
	 public boolean oursolution()
	 {
		 return ourSolution.isEnabled();
	 }
	 public boolean whytendable()
	 {
		 return whyTendable.isEnabled();
	 }
	 public boolean homeTendrdemo()
	 {
		 home.click();
		 return requestDemohp.isEnabled();
	 }
	 public boolean ourstoryrdemo()
	 {
		 ourStory.click();
		 return requestDemopg.isEnabled();
	 }
	 public boolean oursolutionrdemo()
	 {
		 ourSolution.click();
		 return requestDemopg.isEnabled();
	 }
	 public boolean whytendablerdemo()
	 {
		 whyTendable.click();
		 return requestDemopg.isEnabled();
	 }
	 public void fillform() {
		 contactUs.click();
		 marketing.click();
		 fullName.sendKeys("Manik Ravindra Kale");
		 orgName.sendKeys("UBS GLOBAL");
		 phoneNo.sendKeys("8668408223");
		 email.sendKeys("manik130223@gmail.com");
		 Select sel=new Select(jobRole);
		 sel.selectByVisibleText("Other");
		 agree.click();
		 submit.click();
	 }
	 public boolean errormsg() {
		 return errorMsg.isDisplayed();
	 }
}
