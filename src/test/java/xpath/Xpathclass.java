package xpath;

import java.io.Console;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.console.model.ConsoleMessage;

public class Xpathclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a)[2]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".oxd-checkbox-wrapper label input[type=checkbox]+.oxd-checkbox-input .oxd-checkbox-input-icon[data-v-6179b72a]")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
