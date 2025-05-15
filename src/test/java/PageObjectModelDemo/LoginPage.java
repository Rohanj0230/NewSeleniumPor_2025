package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	By User_name = By.xpath("//input[@placeholder='Username']");
	By User_pass = By.xpath("//input[@placeholder='Password']");
	By click = By.xpath("//button[normalize-space()='Login']");

	public void userName(String us) {
		driver.findElement(User_name).sendKeys(us);

	}

	public void userPassword(String pass) {
		driver.findElement(User_pass).sendKeys(pass);
	}

	public void Click() {
		driver.findElement(click).click();
	}

}
