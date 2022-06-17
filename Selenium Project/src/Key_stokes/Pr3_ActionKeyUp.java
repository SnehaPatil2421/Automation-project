package Key_stokes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr3_ActionKeyUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		Actions action=new Actions(driver);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		//Actions call overloaded method for each every method
		//Actions with webelement and another is without webelement parameter
		//action method without parameter where cursors
		//in action we used method with parameter
		action.doubleClick(driver.findElement(By.id("txtUsername"))).perform();
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//action.click(driver.findElement(By.id("txtUsername"))).perform();
		//action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.CONTROL +"v");
		//driver.findElement(By.id("txtPassword")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		  driver.findElement(By.name("Submit")).click();
	}
}
