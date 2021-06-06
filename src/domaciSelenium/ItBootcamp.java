package domaciSelenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;

public class ItBootcamp {

	public static final String URL = "https://itbootcamp.rs/";
	public static final String DONACIJE = "https://itbootcamp.rs/donacije/";
	public static final String SEARCH_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(URL);
		String naslov = driver.getTitle();
		System.out.println(naslov);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.navigate().refresh();
		driver.navigate().to(DONACIJE);
		driver.navigate().back();
		driver.navigate().forward();

		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();

		driver.manage().window().maximize();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().window().setSize(new Dimension(width, height));

		// driver.close();

		WebElement search = driver.findElement(By.className("open-search"));
		search.click();
		WebElement searchBox = driver.findElement(By.name("s"));
		searchBox.click();
		searchBox.sendKeys("testiranje");
		searchBox.sendKeys(Keys.ENTER);

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File ("/Users/admin/Desktop)");
		String screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		System.out.println(file.getPath());
	
		// System.out.println(file.getAbsolutePath());

	}
}
