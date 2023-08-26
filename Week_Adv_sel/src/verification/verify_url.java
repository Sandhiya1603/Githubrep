package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verify_url {
	
	@Test
	public void google() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text() = 'हिन्दी']"));
		String txt = ele.getText();
		System.out.println(txt);
		Assert.assertEquals(txt,"हिन्दी");
		System.out.println("Verified");
		Thread.sleep(1000);
		ele.click();
		
		
	}
	

}
