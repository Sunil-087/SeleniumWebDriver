package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
				//1) find the total no. of rows in a table		
				int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); 
				
				//int row = driver.findElements(By.tagName("tr")).size(); // when you have single table on a website
				
				System.out.println("No. of rows:"+rows); //No. of rows:7
				
				//2) find total no. of columns in a table
				
				int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //for multiple table
				driver.findElements(By.tagName("th")).size();
				System.out.println("Number of columns:"+cols);
				
				//3) Read data from specific row & column (ex: 5th row and 1st column)
				
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
				System.out.println(bookName); //Master In Selenium

				
				//4) Read data from all the row and columns
				
			/*	for(int r=2;r<=rows;r++)
				{
					for(int c=1;c<=cols;c++)
					{
						String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
						System.out.print(value+"\t");
					}
				*/
				
				/*List<WebElement>BookTable=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
				
				for(WebElement bt:BookTable)
				{
					System.out.println(bt.getText());
				}*/
				
				//5) Print book name whose author is Mukesh
				/*for(int r=2;r<=rows;r++)
				{
					String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
					if(authorName.equals("Mukesh"))
					{
						String bookNme=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
						System.out.println(bookNme+"\t"+authorName);
					}*/
				
					//6) Find total price of all the books
				int total=0;
				for(int r=2;r<=rows;r++)
				{
					String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
					total=total+Integer.parseInt(price);

				}	
					System.out.println("Total price of the books"+total);
				}	
		
		
		
	}


