package SelfStudy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class checkbox_approach3 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		//when we create object then automatically browser will launch
		ChromeDriver driver=new ChromeDriver();
		//driver is reference of chromedriver
		//enter the url which you want to enter in browser
		driver.get("https://demoqa.com/checkbox");
		WebElement  HomeCheckbox=driver.findElement(By.xpath("//label[@for=\"tree-node-home\"]/span"));
		//print result which display after selecting checkbox home
		//using webelements instead of webelement as if result is not display it will not throw nosuchelement exception
		//return type of webelements list of webelements
		HomeCheckbox.click();
		List<WebElement> Result=driver.findElements(By.xpath("//div[@id=\'result\']/span"));
	    System.out.println("Result size"+Result.size());
		//System.out.println(Result.get(0).getText().contains(""));
		Iterator<WebElement> itr=Result.iterator();
		while(itr.hasNext())
		{
			System.out.println("iterator value "+itr.next().getText());
		}
		
		
		
	}
}