package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='withOptGroup']//div[contains(@class,'-indicatorContainer')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("react-select-2-option-0-0")).click();
		
		
	}
}
