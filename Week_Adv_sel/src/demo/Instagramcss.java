package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramcss
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name = 'username']")). sendKeys("dhiya.san20@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector name("password"));
		ele1.sendKeys("Virtusa@1603");
		Thread.sleep(1000);
		WebElement ele2 = driver.findElement(By.tagName("button"));
		ele2.click();
		
}

	