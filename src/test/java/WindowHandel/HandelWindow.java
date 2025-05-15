package WindowHandel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		Set<String> windoID = driver.getWindowHandles();

		for (String id : windoID) {
			String win = driver.switchTo().window(id).getTitle();
			System.out.println(win);
			if (win.equals("Human Resources Management Software | OrangeHRM HR Software")) {
				driver.close();

			}

		}

	}
}