package day33;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePaginationTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int noOfRows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		
		for(int r=1;r<=noOfRows;r++)
		{
			//driver.findElement(By.xpath("//ul[@id='pagination']//li")).click();
			String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
			String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
			
			List<WebElement> checkboxes =driver.findElements(By.xpath("//ul[@id='pagination']//a"));
			for(WebElement cb:checkboxes)
			{
				cb.click();
			}
			System.out.println(name+"\t"+price);
			
		}
		

	}

}
