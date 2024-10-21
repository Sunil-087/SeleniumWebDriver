package day22;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://demoblaze.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);
		
		//linktext & partiallinktext
		//driver.findElement(By.linkText("Samsung galaxy s6")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//classname
		//List<WebElement> headerLinks = driver.findElements(By.className("list-inline"));
		//System.out.println("total number of header links:"+headerLinks.size());
		
		//tagname
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("total number of links:" +links.size());
		
		//List<WebElement> images = driver.findElements(By.tagName("img"));
		//System.out.println("total number of images:"+images.size());
	}

}
