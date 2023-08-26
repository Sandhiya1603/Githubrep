package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("email"));
		ele.sendKeys("san_roshi@yahoo.co.in");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("pass"));
		ele1.sendKeys("Positive@67");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.tagName("button"));
		ele2.click();
		
		
		
	}
}
