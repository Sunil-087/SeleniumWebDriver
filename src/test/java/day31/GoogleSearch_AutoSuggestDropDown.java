package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium"); //Search Box
		Thread.sleep(5000);
		
		//Get the size of the list
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		System.out.println("Total count of list:"+list.size());
		
				
		//Get the search results and print with 
		
		for(int i=0;i<list.size();i++)
		{
			WebElement element = list.get(i);
			System.out.println("Text value" +element.getText());
		}
		//With Enhanced for loop
		/*for(WebElement ele:list)
		{
			String text=ele.getText();
			System.out.println("Search Results:"+text);
			
			//Click on one of the search result	
			if(text.contains("selenium uses"))
			{
				ele.click();
				break;
			}
			*/
		}
		
		
		
	}


