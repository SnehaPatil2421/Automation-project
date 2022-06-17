package Key_stokes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chord_key {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
	/*driver.findElement(By.id("txtUsername")).sendKeys(Keys.chord("ravi",Keys.CONTROL,"a",Keys.CONTROL,"c"));
	driver.findElement(By.id("txtPassword")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	*/
	//assignment
	/*1.multiple action in one goal without using chord--it will work and run the program
	2.use chord method in action class--doen"t support
*/
		driver.findElement(By.id("txtUsername")).sendKeys("rrr",Keys.CONTROL,"a");
		
	
	}

}
