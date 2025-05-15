package TestNgAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class BfClass {

	@BeforeClass
	public void login() {
		System.out.println("I am from BeforeClass User Logedin Successfully");

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

	@AfterClass
	public void LogOut() {

		System.out.println("I am from afterClass Method User logedout successfully");
	}

}
