package ParameterTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterT {

	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(String br) {

		switch (br) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
		}

	}

	@Test
	@Parameters({ "url", "us", "pas" })
	public void testDemo1(String url, String us, String pas) {

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(us);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pas);
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();

	}

}
