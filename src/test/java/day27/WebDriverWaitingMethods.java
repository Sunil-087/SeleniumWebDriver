package day27;

public class WebDriverWaitingMethods {
	
	/*
	 wait commands
	 ------------
	 Synchronization
	 
	 Thread.sleep()
	 
	 1) implicit wait
	 2) explicit wait/fluent wait
	 
	 NoSuchElementException		- Element is not present on the page, Synchronization.
	 ElementNotFoundException	- locator is incorrect
	 
	 sleep()
	 -----------
	 Advantage:
	 1) easy to use
	 
	 Disadvantage:
	 1) if the time is not sufficient then you will get exception
	 2) it will wait for maximum time out. this will reduce the performance script.
	 3) multiple times
	 
	 ** Thread.sleep() --	is a java command not a webdriver command.
	 ** There are only 2 types of wait in WebDriver 
	 *	1) Implicit wait.
	 *	2) Explicit wait
	 
	 implicit wait
	 ----------------------
	 driver.manage().timeouts().implicityWait(Duration.ofSeconds(10));
	 
	 Advantage:
	 1) single time/one statement
	 2) it will not wait till maximum time if the element is available.
	 3) Applicable for all the elements
	 4) easy to use
	 
	 Disadvantage:
	 1) if the time is not sufficient then you will get exception
	 
	 explicit wait
	 ---------------------
	 declaration
	 use
	 
	 1) Conditional based, it will work more effectively.
	 2) finding element is inclusive (for some conditions)
	 3) it will wait for condition to be true, then consider the time.
	 4) we need to write multiple statements for multiple elements
	 
	 */

}
