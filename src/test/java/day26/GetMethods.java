package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//get(url) -- opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle() -- returns title of the page
		System.out.println(driver.getTitle());  //OrangeHRM
		
		//getCurrentUrl() -- returns URL of the page
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		//getPageSource() -- returns source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() -- returns ID of the single Browser window
		//String windowid= (driver.getWindowHandle());
		//System.out.println("Window ID:"+windowid); //B2E6630C09C21A99C5D066F65D5DB2AA
												   //A3E457308F2AFA4C6A1628F34142F8C0
		
		//getWindowHandles() -- returns ID's of the multiple browser windows
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();  //this will open new browser window
		
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids); //[7A1E116D50774CDE4C5F8570FF29A077, 666747F2D54D0CA3327880223A548320]

		
		
		
	}

}
