package seleniumwebdriver;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Myfirstseleniumtest {

	/*
	 * ChromeDriver
	 * SafariDriver
	 * EdgeDriver
	 * FireFoxDriver
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver1 = new FirefoxDriver();
		//SafariDriver driver2 = new SafariDriver();
		
		driver.get("https://www.google.com/");
		driver.getTitle();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.get("https://www.fb.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		//driver.get("https://www.yahoo.com/");
		driver.get("https://www.git.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.get("https://www.github.com/");
		
		
		 driver.getTitle();
		System.out.println(driver.getTitle());
		
		WebDriver driverr=new ChromeDriver(); // we always use this
		
		SearchContext driverr1=new ChromeDriver();
		
		
		
		
		//quit closes all the tab present in the browser
		//driver.quit();
		//close active tab
		driver.close();

	}

}
