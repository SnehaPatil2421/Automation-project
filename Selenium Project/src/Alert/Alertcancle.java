package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcancle {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickbt = driver.findElement(By.xpath("//button[@id=\"confirmButton\"]"));
		clickbt.click();
		Alert obj = driver.switchTo().alert();
		Thread.sleep(2000);

		System.out.println(obj.getText());
		obj.dismiss();
	

		
	}
}
 