package Basic_Hybrid;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner_class extends Base_class
{
	@Test
	public void Face() throws InterruptedException
	{
	
		POM_class p = new POM_class(driver);
		p.UN_Enter().sendKeys("Hi");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.UN_Enter().sendKeys("World");
		
		
		
	}
	

}
