package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRunner 
{
	@Test
	public void Face() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		POMScript p = new POMScript(driver);
		p.UN_Enter().sendKeys("Hi");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.UN_Enter().sendKeys("World");
		
		
	}
	

}
