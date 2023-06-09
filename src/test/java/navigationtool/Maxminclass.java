package navigationtool;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
public class Maxminclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000); 
		driver.manage().window().setSize(new Dimension(393,851));
		//opt.window().maximize();
		//Thread.sleep(3000);
		//opt.window().minimize();
		//opt.window().fullscreen();
		//opt.window().setSize(new Dimension(393,851));
		
	}

}
