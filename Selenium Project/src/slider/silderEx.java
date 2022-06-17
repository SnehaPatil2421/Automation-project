package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class silderEx {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		WebElement src=driver.findElement(By.xpath("//span[@class='range-slider__wrap']"));
		Actions action=new Actions(driver);
		int x=src.getLocation().getX();
		System.out.println("value of x "+x);
		int y=src.getLocation().getY();
		System.out.println("value of y "+y);
		//WebElement s=driver.findElement(By.xpath(""))
		action.dragAndDropBy(src, x, y).perform();
}
}
