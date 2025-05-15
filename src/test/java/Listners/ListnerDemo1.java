package Listners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
@Listeners(Listners.ListenClas.class)
public class ListnerDemo1 {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test(priority = 1)
	public void LoginFun() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
	}

	@Test(priority = 2)
	public void CheckTitle() {

		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeM");
	}

	@Test(priority = 3, dependsOnMethods = "CheckTitle")
	public void checkURL() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https:wwenfkdnk");
	}

	@AfterClass
	public void teardown() {
		driver.close();

	}

}
