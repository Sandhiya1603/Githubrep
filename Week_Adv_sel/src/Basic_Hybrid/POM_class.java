package Basic_Hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_class 
{
	//declaration
	@FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
	private WebElement un_txt;
	
	//initialization
	public POM_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement UN_Enter()
	{
		return un_txt;
	}
	
}
