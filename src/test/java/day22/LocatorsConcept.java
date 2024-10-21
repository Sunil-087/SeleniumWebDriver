package day22;

public class LocatorsConcept {

	public static void main(String[] args) {
		
		
		/*
		 name
		 linkText
		 partialLinkText
		 
		 TagName
		 Class
		 
		 driver.findElement(locator)
		 
		 Tablets Table --- linkText()
		 Submit  Send --- partialLinkText()
		 
		 findElement() ---- Single WebElement
		 findElements() --- multiple WebElements
		 
		 Scenario 1 : locator matching with single web element
		 findElement() ---- single WebElement     WebElement
		 findElements() --- single WebElements  List<WebElement>
		 
		 Scenario 2: Locator is matching with multiple web elements
		 findElement(loc) ---- single web element    WebElement
		 findElements(loc) --- multiple web element  List<WebElement>
		 
		 Scenario 3: Locator is not matching with any element/s
		 findElement(loc) ---- No Such Element Exception
		 findElements(loc) --- will not throw any exception, Return 0
		 */
	}

}
