package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verify {

	@Test
	public void amazon()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
		System.out.println("Verified");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
}
}