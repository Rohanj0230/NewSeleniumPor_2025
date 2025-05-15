package WindowHandel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreamHandel {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");

		WebElement Frame_1st = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(Frame_1st);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();

		WebElement src2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(src2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome");

	}

}
