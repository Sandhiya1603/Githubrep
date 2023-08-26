package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class verify_soft {

	@Test
	public void amazon() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		SoftAssert ast = new SoftAssert();
		ast.assertEquals(title, "amazon");
		System.out.println("Execution continues");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tab");
		ast.assertAll();
		
		
}

}