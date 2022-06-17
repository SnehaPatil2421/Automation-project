package Key_stokes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keydown_keyup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.facebook.com");
		obj.manage().window().maximize();
		WebElement email=obj.findElement(By.id("email"));
		email.sendKeys("snehapatil2496@gamil.com");
		Actions act=new Actions(obj);
		
		  act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		  act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		  act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform() ;
		  act.sendKeys(Keys.TAB);
		  obj.findElement(By.name("login")).click();
		   
		   // obj.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		  		  //act.sendKeys(Keys.ENTER).build().perform(); 
		  
		/*act.sendKeys(Keys.chord("shivani123@gmail.com",Keys.CONTROL, "a",Keys.CONTROL, "c")).build().perform();
		obj.findElement(By.id("pass"));
		act.sendKeys(Keys.CONTROL ,"v").perform();
        */
	}

}
