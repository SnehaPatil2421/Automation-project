package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promtButton {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	WebElement clickbt2= driver.findElement(By.id("promtButton"));
	clickbt2.click();
	Alert obj2 = driver.switchTo().alert();
	Thread.sleep(2000);
	obj2.sendKeys("sneha");
	
     System.out.println(obj2.getText());
	obj2.accept();
	//obj2.dismiss();
	
	driver.quit();
}
}