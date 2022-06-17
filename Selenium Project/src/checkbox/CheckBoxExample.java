package checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBoxExample {
public static void main(String[] args) {
		
		//APPROACH 1- SELECTING HOME PAGE CHECKBOX AND JUST READ THE RESULT
		
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/checkbox");
		//Find the address of home checkbox
		WebElement HomeCheckbox=driver.findElement(By.xpath("//label[@for='tree-node-home']"));
		//Check the Home checkbox
		HomeCheckbox.click();
		//Print the result which display after selecting the checkbox home 
		WebElement Result=driver.findElement(By.xpath("//div[@id='result']"));
		System.out.println(Result.getText());
		
		//APPROACH 2- SELECTING HOME PAGE CHECKBOX IF NOT SELECTED AND  READ THE RESULT IF DISPLAYED
	
	
	}
}
