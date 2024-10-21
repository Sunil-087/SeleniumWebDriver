package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		//driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		driver.findElement(By.linkText("open cart")).click();
		
		
		//isEnabled()
		//boolean status = driver.findElement(By.xpath("//input[@id='female']")).isEnabled();
		//System.out.println(status);
		
		//isSelected()
		//boolean selected = driver.findElement(By.xpath("//input[@id='sunday']")).isSelected();
		//System.out.println(selected);
	}	

}
