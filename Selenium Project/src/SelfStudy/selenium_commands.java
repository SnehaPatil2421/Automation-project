package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class selenium_commands {
public static void main(String[] args) {
	
	/* System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
  
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/login/");
	 
	 driver.manage().window().maximize();//to maximize the browser
	 driver.manage().window().fullscreen();// for fullscreen mode
	 
	 Dimension d=new Dimension(300, 800);
	 driver.manage().window().setSize(d);//to set the size of browser window
	 
	 driver.findElement(By.id("email"));//we can find required UI element
	 
	 driver.findElement(By.id("email")).sendKeys("snehapatil@982");//it will send specific value to text field
	 driver.findElement(By.id("pass")).sendKeys("@sneha");
	 //driver.findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
	 driver.findElement(By.id("loginbutton")).click();
	 driver.quit();*/
	 System.setProperty("webdriver.edge.driver","D:\\core java(automation)\\Selenium Project\\resources\\msedgedriver.exe");
	  
	 EdgeDriver driver=new EdgeDriver();
	 driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	 driver.findElement(By.id("identifierId")).sendKeys("snehapatil24696@gamil.com");
	 driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	 driver.quit();


}
}
