package domaciSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ItBootcampTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		driver = new ChromeDriver();
	}

	@Test
	public void testButton() {
		driver.navigate().to(ItBootcamp.URL);
		driver.findElement(By.ByLinkText.linkText("DONACIJE")).click();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = ItBootcamp.DONACIJE;
		Assert.assertEquals(actualUrl, expectedUrl);
	}
}
