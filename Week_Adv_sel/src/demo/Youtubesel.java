package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubesel {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		WebElement ele = driver.findElement(By.name("search_query"));
		ele.sendKeys("All we know");
		WebElement ele1 = driver.findElement(By.id("search-icon-legacy"));
		ele1.click();
		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.xpath("//a[@href=\"/watch?v=7mWQ38SpEf8&pp=ygULQWxsIHdlIGtub3c%3D\"]"));
		ele2.click();
		Thread.sleep(5000);
		WebElement like = driver.findElement(By.xpath("//button[@aria-label='Share']/../../../ytd-segmented-like-dislike-button-renderer[1]/yt-smartimation//span"));
		String txt=like.getText();
		System.out.println(txt);
		


	}	
}	