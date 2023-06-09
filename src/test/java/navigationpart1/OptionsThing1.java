package navigationpart1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
public class OptionsThing1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		Options opt =driver.manage();
		//opt.window().maximize();
		//opt.window().minimize();
		opt.window().fullscreen();//in automation avoid this focus on maximize
		driver.manage().window().setSize(new Dimension(0, 0));
		Thread.sleep(5000);
		driver.get("https://google.com");

	}

}
