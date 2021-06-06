package guruDemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lokatori {

	public static final String URL = "http://demo.guru99.com/test/newtours/";

	public static final String REG_URL = "http://demo.guru99.com/test/newtours/register.php";

	public static final String SUBMIT_URL = "http://demo.guru99.com/test/newtours/register_sucess.php";

	public static final String FIRSTNAME_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";

	public static final String LASTNAME_SELECTOR = "body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input";

	public static final String PHONE_NAME = "phone";

	public static final String EMAIL_ID = "userName";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(URL);
		driver.navigate().to(REG_URL);
		driver.findElement(By.xpath(FIRSTNAME_XPATH)).sendKeys("Miona");
		driver.findElement(By.cssSelector(LASTNAME_SELECTOR)).sendKeys("Milcic");
		driver.findElement(By.name(PHONE_NAME)).sendKeys("00456789");
		driver.findElement(By.id(EMAIL_ID)).sendKeys("lalal@gmail.com");
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}