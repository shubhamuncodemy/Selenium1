package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestNG {
	
	WebDriver driver;
	@Test
	public void test1() throws InterruptedException

	{
		driver = new ChromeDriver();
		driver.get("https://github.com/");
		System.out.println("Id is"+Thread.currentThread().getId());
		//"Name is"+Thread.currentThread().getName();
		Thread.sleep(10000);
		driver.close();
	}

	@Test
	public void test2()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Id is"+Thread.currentThread().getId());
		driver.close();
	}
	/*
	@Test
	public void test3() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(15000);
		driver.close();
		
	}
	*/

}
