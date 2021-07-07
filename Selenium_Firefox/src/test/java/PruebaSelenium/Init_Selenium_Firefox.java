package PruebaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Init_Selenium_Firefox {
	
	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.close();
	}

		
}
