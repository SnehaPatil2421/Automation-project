package checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Approach2 {

	public static void main(String[] args) {
		
		
		//APPROACH 2- SELECTING HOME PAGE CHECKBOX IF NOT SELECTED AND  READ THE RESULT IF DISPLAYED
		
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/checkbox");
		//Find the address of home checkbox
		WebElement HomeCheckbox=driver.findElement(By.xpath("//label[@for='tree-node-home']/span"));
		//Check the Home checkbox only if it is not already selected
		
		
		/*
		 * if(!HomeCheckbox.isSelected()) { HomeCheckbox.click(); }
		 */
		//Print the result which display after selecting the checkbox home 
		WebElement Result=driver.findElement(By.xpath("//div[@id='result']"));
		//Read the Result only if it is display
		if(Result.isDisplayed()) {
			System.out.println(Result.getText());
		}
		
		//APPROACH 3 -WHAT HAPPEN IF CHECK BOX IS NOT SELECTED THEN WHAT WILL HAPPEN TO RESULT

	}
}
