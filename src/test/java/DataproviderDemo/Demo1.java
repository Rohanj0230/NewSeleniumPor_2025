package DataproviderDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test(dataProvider = "dp")
	public void LoginTest(String us,String ps) throws Exception {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.cssSelector("#input-email")).sendKeys(us);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}

	@DataProvider(name = "dp")
	public Object[][] testData() {

		Object[][] ob = { { "abc@123.gmail.com", "abc@123" }, { "xyz@123gmail.com", "xyz@123" },
				{ "hlm@123gmail.com", "hml@123" } };

		return ob;

	}

}
