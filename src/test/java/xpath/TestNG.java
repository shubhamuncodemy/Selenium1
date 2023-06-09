package xpath;

import org.testng.annotations.Test;


public class TestNG {
	
	@Test()
	public void test1()
	{
		System.out.println("Test 1 is executed");
		System.out.println("Id is"+Thread.currentThread().getId());
	}
	
	@Test
	public void fail()	
	{
		System.out.println("Test 2 is executed");
		System.out.println("Id is"+Thread.currentThread().getId());
	}

}
