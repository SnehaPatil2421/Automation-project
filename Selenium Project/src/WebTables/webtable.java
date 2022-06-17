package WebTables;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		List<WebElement> columnname = driver.findElements(By.xpath("//div[@role=\"columnheader\"]"));

	/*	for (int i = 0; i < columnname.size(); i++) 
		{
			System.out.println("  "+columnname.get(i).getText());
			if (columnname.get(i).getText().equalsIgnoreCase("email"))
			{
				System.out.println("we have column as email");
				System.out.println("column no is "+(i+1));
				break;
			}

		}*/
		Iterator<WebElement> itr=columnname.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getText().equals("email"))
			{
				System.out.println("we have column as email");
			}
		}
		
		List<WebElement> row = driver.findElements(By.xpath(" //div[@role=\"gridcell\"]"));
				Iterator<WebElement> itr1=row.iterator();
				while(itr1.hasNext())
				{
					
						System.out.println(itr1.next().getText());
					
				}
	
			// List<WebElement> row = driver.findElements(By.xpath(" //div[@role=\"gridcell\"]"));
				
				/*for (int i = 0; i < columnname.size(); i++) 
				{
					System.out.println("  "+columnname.get(i).getText());
					if (columnname.get(i).getText().equalsIgnoreCase("department"))
					{
						//System.out.println("we have column as department");
						//System.out.println("column no is "+(i+1));
					   break;
				
						Iterator<WebElement> itr1=row.iterator();
						while(itr1.hasNext())
						{
							
								System.out.println(itr1.next().getText());
						
						}
					}

				}*/
				 driver.quit();
	}

}
