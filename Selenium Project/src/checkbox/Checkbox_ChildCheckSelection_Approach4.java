package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_ChildCheckSelection_Approach4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/checkbox");
		//Find the address of home checkbox
		//driver.findElement(By.xpath("//button[@title=\"Toggle\"]")).click();;
		WebElement MainArrow=driver.findElement(By.xpath("//div[@id='tree-node']//ol/li//button"));
		//Check the Home checkbox only if it is not already selected
			MainArrow.click();
			
			//div[@id='tree-node']//ol/li//li[1]//button
	     	WebElement desktop=driver.findElement(By.xpath("//label[@for='tree-node-desktop']"));//preceding-sibling::button
			desktop.click();
			WebElement Result=driver.findElement(By.xpath("//div[@id='result']"));
			System.out.println(Result.getText());
		//span[text()='Desktop']//ancestor::label   //preceding-sibling::button
		
		//WebElement desktop1=driver.findElement(By.xpath("span[text()='Desktop']//ancestor::label "));
	}
}
