package PageObjectModelDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void LoginTestCheck() {

		LoginPage page = new LoginPage(driver);
		page.userName("Admin");
		page.userPassword("admin@123");
		page.Click();

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
