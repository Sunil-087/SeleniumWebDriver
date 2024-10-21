package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingWebsite {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=' Go ']")).click();
		Thread.sleep(5000);
		
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
	}

}
