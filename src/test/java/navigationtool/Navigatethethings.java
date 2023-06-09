package navigationtool;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatethethings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		driver.get("https://github.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();//facebook
		Thread.sleep(5000);
		driver.navigate().forward();//github
		Thread.sleep(5000);
		driver.navigate().refresh();//refresh the current tab/website
		
		//driver.navigate().to("https://www.facebook.com/");
		
		//driver.quit();
		driver.close();
		

	}

}
