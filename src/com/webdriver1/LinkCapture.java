package com.webdriver1;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkCapture {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.gmail.com/");
		//Return all elements that are of 
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int alist = list.size();
		System.out.println("Number of links "+ alist);
		for(int i=0;i<alist; i++){
			if(!list.get(i).getText().equals("")){
				System.out.println("Link text is "+ list.get(i).getText());
				System.out.println(" ");
				System.out.println("Url is "+ list.get(i).getAttribute("href"));
				System.out.println("");
			}
		}
		//Capture Screen Shot
		File myImg=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String myp = "C://Selenium/test.jpg";
		FileUtils.copyFile(myImg, new File(myp));
		Thread.sleep(2000);
		driver.close();

	}

}
