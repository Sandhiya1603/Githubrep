package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("search_query"));
		ele.sendKeys("All we know");
		WebElement ele1 = driver.findElement(By.id("search-icon-legacy"));
		ele1.click();
			
		
	}

}
