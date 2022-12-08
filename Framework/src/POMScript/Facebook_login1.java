package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login1 {

	@FindBy(id = "email")
	private WebElement usntbox;
	@FindBy(id = "pass")
	private WebElement pwdtbox;
	@FindBy(name = "login")
	private WebElement loginbtn;
	
	//initialization
	public Facebook_login1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public void username(String un)
	{
		usntbox.sendKeys(un);
	}
	public void password(String pwd)
	{
		 pwdtbox.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		loginbtn.click();
	}
	
	
}
