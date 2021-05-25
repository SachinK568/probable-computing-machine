package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genric.Base_page;

public class Flipkart_login extends Base_page {
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	public WebElement user;
	@FindBy(xpath="//input[@type='password']")
	public WebElement pass;
	@FindBy(xpath="(//span[.='Login'])[3]")
	private WebElement login;
	//Initialization
	public Flipkart_login(WebDriver driver) {
		super(driver);
	}
	//Utilization
	public void setuser(String email)
	{
		user.sendKeys(email);
	}
	public void setpwd(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void login()
	{
		
		login.click();
	}

}
