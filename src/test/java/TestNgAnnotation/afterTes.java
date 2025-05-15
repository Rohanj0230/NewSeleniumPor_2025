package TestNgAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class afterTes {

	@BeforeTest
	public void login() {
		System.out.println(" I am from beforeTest User Logedin Successfully");

	}

	@Test
	public void TestLogo() {

		boolean val = true;
		Assert.assertEquals(true, val);
		System.out.println("user checking logo");
	}

	@Test
	public void TestPage() {

		boolean val = true;
		Assert.assertEquals(true, val);
		System.out.println("User checking page");
	}

	@AfterTest
	public void LogOut() {

		System.out.println(" I am from after Test Method User logedout successfully");
	}

}
