package WindowHandel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.cssSelector(".wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.cssSelector(".wikipedia-search-button")).click();
		List<WebElement> list = driver.findElements(By.tagName("a"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}

	}

}
