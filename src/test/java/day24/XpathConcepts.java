package day24;

public class XpathConcepts {

	public static void main(String[] args) {
		
		/*
		 XPath is an address of the element.
		 
		 DOM - Document Object Model
		 
		 2 types of Xpath
		 ------------------
		 1) Absolute Xpath (full Xpath)  	
		 			Ex: 	/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/input[1]
		 
		 2) Relative Xpath (partial Xpath)	
		 			Ex: 	//input[@placeholder='Search']
		 			
		 	Which Xpath will be preferred?
		 	Relative Xpath
		 	
		 	Difference between Absolute & Relative Xpaths?
		 	----------------
		 	1) Absolute xpath do not use attributes  /   ---> represents root node
		 	   Relative xpath starts with 			//  
		 	
		 	2) Absolute xpath do not use attributes
		 	   Relative xpath works with attribute
		 	   
		 	3) Absolute xpath traverse through each mode till it finds element
		 	   Relative xpath directly jump and find the element by using attribute
		 	
		 	Relative xpath
		 	-----------------
		 	1) Automatically  -- Devtool, selectorshub
		 	2) Manually(own xpath)
		 	
		 	syntax:
		 	------
		 	//tagname[@attribute='value']
		 	//*[@attribute='value']
		 	
		 	//img[@title="MacBook"]
		 	 
		 	Xpath with single attribute
		 	------------
		 	driver.findElement(By.xpath("//input[@placeholder= 'Search']")).sendKeys("T-shirts");
		 	
		 	Xpath with multiple attributes 
		 	----------------------
		 	driver.findElement(By.xpath("//input[@name='search' and @placeholder = 'Search']")).sendKeys("T-shirts");
		 	
		 	Xpath with 'and' 'or' operators
		 	------------------------------
		 	Xpath with 'and' operator      here both attributes should be correct/true, otherwise it will not locate the element.
			driver.findElement(By.xpath("//input[@name='search' and @placeholder = 'Search']")).sendKeys("T-shirts"); 
		
			Xpath with 'or' operator      here at-least one attribute should be true/correct, no need to correct both attributes.
			driver.findElement(By.xpath("//input[@name='search' or @placeholder = 'Search']")).sendKeys("T-shirts"); 
		 	
		 	Xpath with inner text - text()
		 	----------------
		 	//a[text()='Desktops']
		 	//a[text()='MacBook']
		 	 /
		 	
		 	<a href= "https://xyz.com"> Click Me </a>
		 	
		 	linktext = yes
		 	inner text = yes
		 	
		 	<div>welcome</div>
		 	linktext = 	no
		 	innertext = no
		 	
		 	xpath with contains()
		 	---------------
		 	//input[contains(@placeholder,'sea')]
		 	 
		 	xpath with startswith()
		 	--------------
		 	//input[starts-with(@placeholder,'Sea')]
		 	
		 	contains() ---		values can be anywhere
		 	startswith() ---	values start at the beginning
		 	
		 	
		 	Handling dynamic attributes (v.v.imp)
		 	---------------------
		 	//*[@id='start' or @id='stop']
		 	//*[contains(@id,'st')]
		 	//*[starts-with(@id,'st')] 
		 	 
		 	e.g. = name=xyz001  xyz002  xyz003  xyz004  xyz001 xyz002
		 	
		 	//*[contains(@name,'xyz')]
		 	//*[contains(@name,'00')]
		 	//*[starts-with(@name,'xyz')]
		 	
		 	name= 001xyz 002xyz 003xyz 004xyz 001xyz
		 	//*[contains(@name, 'xyz')]
		 	//*[starts-with(@name,'00')]
		 	
		 	name= 1xyz 2xyz 3xyz 4xyz 1xyz
		 		//*[contains(@name, 'xyz')]
		 	
		 	name= 101xyz 201xyz 301xyz 401xyz
		 		//*[contains(@name,'xyz')]
		 		//*[contains(@name,'01')]
		 	
		 	chained xpath (When you are not finding any attributes of the element & even not having inner text)
		 	--------------------
		 	combination of relative & absolute xpath (chained xpath)
		 	//div[@id='logo']/a/img
		 	
		 	
		 	
		 	 */
		 	 
		 	
		 	 
		 	
		 			 	 
		 	 		 
			
	}

}
