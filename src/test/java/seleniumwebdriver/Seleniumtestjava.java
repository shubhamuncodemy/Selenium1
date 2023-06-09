package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtestjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://43.204.246.211/pinaki_backend/admin/login");
		driver.findElement(By.xpath("//a[@href='http://43.204.246.211/pinaki_backend/password/reset?user_type=admin']")).click();
		//driver.get("https://www.google.com");
		
		//driver.close();
		
		
		
		
		

	}

}
