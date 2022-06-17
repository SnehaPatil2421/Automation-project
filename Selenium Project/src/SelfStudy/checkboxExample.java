package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxExample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/checkbox");
	WebElement  HomeCheckbox=driver.findElement(By.xpath("//label[@for=\"tree-node-home\"]"));
	HomeCheckbox.click();//check home checkbox
	//print the result which display after selecting checkbox home
	//WebElement Result=driver.findElement(By.xpath("//div[@id=\"result\"]"));//noSuchElementException
	WebElement Result=driver.findElement(By.id("result"));
	System.out.println(Result.getText());
	
	
	
	driver.quit(); 
	
} 
}
