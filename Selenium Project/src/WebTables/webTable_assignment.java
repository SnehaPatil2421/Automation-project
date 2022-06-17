package WebTables;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable_assignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		List<WebElement> columnname = driver.findElements(By.xpath("//div[@role='columnheader']"));
		List<WebElement> row = driver.findElements(By.xpath(" //div[@role='gridcell']"));
		WebElement delete = driver.findElement(By.xpath("//span[@id='delete-record-3']"));
		for (int i = 0; i < columnname.size(); i++) {
			if (columnname.get(i).getText().equalsIgnoreCase("department")) {
				System.out.println("column no is " + (i + 1));
				Iterator<WebElement> itr = row.iterator();
				while (itr.hasNext()) {
					if (itr.next().getText().equalsIgnoreCase("Legal")) {
						delete.click();
						break;
					}
				}

			}
		}

	}
}
