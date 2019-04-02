package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\YasirAhmedSiddiqui\\Downloads\\Compressed\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.wikipedia.org");Thread.sleep(2000);
		
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software Project Management");
		Thread.sleep(2000);
		
		WebElement clicking;
		clicking=driver.findElement(By.tagName("button"));	
		clicking.click();
		Thread.sleep(4000);
		
		driver.quit();
	
	}
	
	
}
