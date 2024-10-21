package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder= 'Search']")).sendKeys("T-shirts");
		
		
		//Xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		
		//Xpath with 'and' operator      here both attributes should be correct/true, otherwise it will not locate the element.
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder = 'Search']")).sendKeys("T-shirts"); 
		
		//Xpath with 'or' operator      here at-least one attribute should be true/correct, no need to correct both attributes.
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder = 'Search']")).sendKeys("T-shirts"); 
		
		//Xpath with inner text - text()
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		//boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displaystatus);
		
		//String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(value);
		
		
		//Xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		//xpath with startwith()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		//chained xpath
		boolean imagestatus = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(imagestatus);
		
		
	}
	

}
