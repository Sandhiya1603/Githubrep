package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript 
{
	//declaration
	@FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
	private WebElement un_txt;
	
	//initialization
	public POMScript(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement UN_Enter()
	{
		return un_txt;
	}
	
}
