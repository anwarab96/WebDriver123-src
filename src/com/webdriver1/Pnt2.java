package com.webdriver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class Pnt2 {
	static WebDriver driver;
	static String baseUrl;
	String expectedTitle;
	String actualTitle;
	public static void main(String[] args) throws Exception {
		 driver = new FirefoxDriver();
		 //baseUrl ="http://www.google.com/";
		 baseUrl ="http://www.piit.us/home/";
		driver.navigate().to(baseUrl);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step step Tc ( test case)execution
		//to get the title naem and verify/assertion=>Tc@01
		//System.out.println("The title of Piit Home is : " + driver.getTitle();
		//verification Test: actual ==expected, start from here=>
		String expectedTitle= "PeopleNTech Institute of Information Technology-PIIT";
		String actualTitle = driver.getTitle();
		Thread.sleep(3000);
		//comparing the actual result 
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("HomePage Verification Title is Passed! ");
			
		}else
		{
			System.out.println("HomePage verification Title is Failed! ");
			
		}//end of if and else
		//OR
		//verification Test: actual ==expected, start from here=>
				 expectedTitle= "PeopleNTech Institute of Information Technology-PIIT";
				 actualTitle = driver.getTitle();
				Thread.sleep(3000);
				//comparing the actual result 
				try 
				{
					Assert.assertEquals(actualTitle, expectedTitle);
						System.out.println("HomePage Verification Title is Passed! ");
				} catch (Throwable e)
				{
					
					System.out.println("HomePage Verification Title is Failed! ");
				}
						
		//quit the driver
		driver.quit();
	}//end of main
}//end of class

	

