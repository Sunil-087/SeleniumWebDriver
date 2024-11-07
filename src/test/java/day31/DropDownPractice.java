package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		driver.findElement(By.xpath("//select[@id='country-list']")).click();
		Thread.sleep(5000);
		
		//Select one option
		//driver.findElement(By.xpath("//option[@value='3']")).click();
		
		
		//count total number of options
		//List<WebElement>options= driver.findElements("//option[normalize-space()='Select Country']")
		//System.out.println("Total no. of options"+options.size());
		
		//
	}

}
