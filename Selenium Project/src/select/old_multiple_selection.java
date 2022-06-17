package select;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class old_multiple_selection {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	//1. we will select drop down
	WebElement selectelement=driver.findElement(By.id("cars"));
	//2. create object of select class
	Select select=new Select(selectelement);
    //3. use specific method of select class
    
	
	//A. Get all option of drop down
	List<WebElement> opt=select.getOptions();
	Iterator<WebElement> t=opt.iterator();
	while(t.hasNext())
	{
		System.out.println(t.next().getText());
	}
    //B. one allow single selection and another multi selection
	System.out.println(select.isMultiple());
	
	//C.Select multiple value
	select.selectByIndex(0);
	select.selectByIndex(1);
	
	//D. deselect remove the selection
	select.deselectByVisibleText("saab");

    //E. deselect all option of drop down
	select.deselectAll();
	
	
	select.getAllSelectedOptions();
    select.getFirstSelectedOption();
}
}
