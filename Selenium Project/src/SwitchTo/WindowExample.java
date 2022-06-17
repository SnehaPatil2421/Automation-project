package SwitchTo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		System.out.println("this is my first window id"+parentwindow);
		driver.findElement(By.id("tabButton")).click();
		Set<String> obj=driver.getWindowHandles();
		System.out.println(obj.size());
		Iterator Itr=obj.iterator();
		while(Itr.hasNext())
		{
		   String str=Itr.next().toString();
		   if(!str.equalsIgnoreCase(parentwindow))
		   {
			 //  System.out.println("we both present in same window");
			   System.out.println("we both present in diff. window");
			   driver.switchTo().window(str);
			   WebElement heading=driver.findElement(By.tagName("h1"));
			   System.out.println(heading.getText());
		   }
		}
		
		

	}

}
