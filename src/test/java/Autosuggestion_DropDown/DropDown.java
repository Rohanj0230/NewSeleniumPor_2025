package Autosuggestion_DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// table[@name='BookTable']//tr[2]//td[2]
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//td")).size();

		System.out.println(row);
		System.out.println(col);

		for (int r = 2; r <= row; r++) {

			for (int c = 1; c <= col; c++) {

				String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
				System.out.println(bookname);
			}

		}

	}

}
