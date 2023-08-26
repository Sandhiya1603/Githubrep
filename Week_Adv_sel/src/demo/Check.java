package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Acer/Desktop/check.html");
		List<WebElement> eles = driver.findElements(By.xpath("//input"));
		int count = eles.size();
		for(WebElement ele:eles)
		{

			ele.click();
		}
		for(int i=count-1;i>=0;i--)
		{
			WebElement ele= eles.get(i);
			ele.click();

		}

}
}
		