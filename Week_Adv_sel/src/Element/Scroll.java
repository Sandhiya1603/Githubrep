package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//a[text() = 'Facebook']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Point loc = ele.getLocation();
		System.out.println(loc);
		
		int x = loc.getX();
		System.out.println(x);
		int y = loc.getY();
		System.out.println(y);
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy("+(x-50)+","+(y-50)+")");
		ele.click();
		
		

	}

}
