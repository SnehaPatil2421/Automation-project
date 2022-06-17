package Key_stokes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_key {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("ravindra");
		
		driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
		

	}
}
