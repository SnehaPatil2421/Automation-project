package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClassMethod {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
	Select obj=new Select(dropdown);
	obj.selectByIndex(3);
	//obj.deselectByVisibleText(text);
	//obj.selectByValue(value);
	
	
}
}