package xpath;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub4
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://reqres.in/");
		Thread.sleep(5000);
		
		HttpURLConnection c=(HttpURLConnection)new URL("https://reqres.in/api/users").openConnection();
		
		c.setRequestMethod("HEAD");
		
		c.connect();
		int r = c.getResponseCode();
		System.out.println(r);
		driver.close();

	}

}
