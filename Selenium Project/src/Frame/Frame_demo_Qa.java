package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_demo_Qa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/nestedframes");
		WebElement firstframe = driver.findElement(By.id("frame1"));

		driver.switchTo().frame(firstframe);
		System.out.println(driver.findElement(By.tagName("body")).getText());

		WebElement secondframe = driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]"));
		driver.switchTo().frame(secondframe);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.tagName("body")).getText());

	}
}
