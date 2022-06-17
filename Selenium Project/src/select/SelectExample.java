package select;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
  public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement selectelement=driver.findElement(By.id("oldSelectMenu"));
		//to select the drop down and tag is select for it
		//which class we have to use-----select
		
		Select obj=new Select(selectelement);
		if(obj.getFirstSelectedOption().getText().equalsIgnoreCase("red"))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		// operation 1------>select the value from drop down
		//select by index---->index will start from zero
		obj.selectByIndex(2);
		
		//select by visible text---->visible text which is display in dropdown
		obj.selectByVisibleText("Purple");
		
		//select by value
		obj.selectByValue("7");
		
		//get all option
		List<WebElement> opt=obj.getOptions();
		Iterator<WebElement> test=opt.iterator();
		while(test.hasNext())
		{
			System.out.println(test.next().getText());
		}
			
}
}
