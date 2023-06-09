package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Seleniumwebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this below step is for selenium 4.5.0 or below 
		//option 1 use manaually
		System.setProperty("webdriver.chrome.driver","");
		
		//option 2 Use WDM
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		

	}

}
