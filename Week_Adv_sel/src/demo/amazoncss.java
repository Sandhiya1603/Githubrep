package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazoncss 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id = 'twotabsearchtextbox']")).sendKeys("laptop");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type = 'submit']")).click();
		
			
		
	}
}
