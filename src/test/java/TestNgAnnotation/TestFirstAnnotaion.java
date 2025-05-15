package TestNgAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestFirstAnnotaion {

	@BeforeMethod
	public void login() {
		System.out.println("I am from BeforeMethod User Logedin Successfully");

	}

	@Test(groups = { "Sanity" })
	public void TestLogo() {

		boolean val = true;
		Assert.assertEquals(true, val);
		System.out.println("user checking logo");
	}

	@Test(groups= {"Smoke"})
	public void TestPage() {

		boolean val = true;
		Assert.assertEquals(true, val);
		System.out.println("User checking page");
	}

	@AfterMethod
	public void LogOut() {

		System.out.println("I am form AfterMethod User logedout successfully");
	}

}
