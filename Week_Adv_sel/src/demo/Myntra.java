package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement ser = driver.findElement(By.className("desktop-searchBar"));
		ser.sendKeys("Shoes");
		Thread.sleep(2000);
		ser.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sort-sortBy']/../../../../../../../div[2]/section[1]/ul[1]/li[5]")).click();
		driver.findElement(By.xpath("//p[text()='8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() = 'ADD TO BAG']")).click();
		
		
	}

}
