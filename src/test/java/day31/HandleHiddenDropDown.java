package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleHiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		//login steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//clicking on PIM
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click(); //PIM
		
		//clicked on dropdown
		driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[3]")).click();
		Thread.sleep(5000);
		//select single option
		//driver.findElement(By.xpath("(//span[normalize-space()='Chief Technical Officer'])[1]")).click();
		
		//count no. of options
		List<WebElement>options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("No. of options are "+options.size()); //30
		
		//print options
		for(WebElement op : options)
		{
			System.out.println(op.getText());
		}
	}

}
