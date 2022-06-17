package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class timerAlertButton {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
		timerAlertButton.click();
		Alert obj1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(obj1.getText());
		obj1.accept();
		driver.quit();
}
}
