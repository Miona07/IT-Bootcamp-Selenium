package domaciSelenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import resources.Constants;



public class RegistrationTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		driver = new ChromeDriver();

	}

	@Test
	public void testRegBtn() {
		driver.navigate().to(Constants.URL);
		Home.clickRegBtn(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.REG_URL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}

	@Test
	public void testRegForm() {
		driver.navigate().to(Constants.REG_URL);
		Registration.inputUsername(driver, "Miona");
		Registration.inputPassword(driver, "lala123");
		Registration.inputConfirmPassword(driver, "lala123");
		Registration.submit(driver);

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";

		Assert.assertEquals(currentUrl, expectedUrl);

	}

}
