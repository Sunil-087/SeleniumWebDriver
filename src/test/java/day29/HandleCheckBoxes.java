package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//1) select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2) select all the checkboxes
		List<WebElement>checkboxes =driver.findElements(By.xpath("//input[@class='form-check-input' and @type ='checkbox']"));
		
		/*for(int i=0;i<checkboxes.size();i++) //with simple for loop
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement checkbox:checkboxes)  //with enhanced for loop
		{
			checkbox.click();
		}
		*/
		
		//3) select last 3 checkboxes
		//total no. of checkboxes - how many checkboxes want to selecct= starting index 
		//7-3=4(starting index)
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//4) select first 3 checkboxes
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		//5) Un-select checkboxes if they are selected
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(int i=0;i<3;i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
			
		}
				
		
	}

}
