package scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("blue star water filters");
		driver.findElement(By.id("nav-search-submit-text")).click();
		//Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(1,900)");
		Thread.sleep(2000);
		
		//driver.findElement(By.name("nav-input nav-progressive-attribute")).click();
		driver.quit();

	}

}
