package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordian {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/accordian");
	    WebElement header=driver.findElement(By.id("section1Heading")); 
	    System.out.println(header.getText());
	    WebElement content=driver.findElement(By.id("section1Content")); 
	    System.out.println(content.getText());
	    header.click();
	  
	    WebElement header1=driver.findElement(By.id("section2Heading"));
	    System.out.println(header1.getText());
	    WebElement content1=driver.findElement(By.id("section2Content"));
	    System.out.println(content1.getText());
	    header1.click();
	    
	    WebElement header2=driver.findElement(By.id("section3Heading"));
	    System.out.println(header2.getText());
	    WebElement content2=driver.findElement(By.id("section3Content"));
	    System.out.println(content2.getText());
	    header2.click();
	}

}
