package Key_stokes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_KeyDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Actions action=new Actions(driver);
		
		driver.findElement(By.id("txtUsername")).sendKeys("ravindra");
		
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//driver.findElement(By.id("txtPassword")).sendKeys(Keys.CONTROL ,"v");
		//another way
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.TAB);
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		//assigment2-using action class retrieve chord method
		
		
		
	}

}
