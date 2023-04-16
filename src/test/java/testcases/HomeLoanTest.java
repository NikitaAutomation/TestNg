package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass{
	
	
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("Inside home loan test 1");
	}
	
	@Test(dependsOnMethods="test3")
	//(priority=1)
	public void test2()
	{
		System.out.println("Inside home loan test 2");
	}
	
	@Test//(priority=0)
	public void test3()
	{
		System.out.println("Inside home loan test 3");
	}
	
	@Test(groups= {"sanity", "regression"})
	public void test4()
	{
		System.out.println("Inside home loan test 4");
	}
}
