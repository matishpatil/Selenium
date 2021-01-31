package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Hooks {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am in after suite");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("I am in before groups");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("I am in after groups");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am in after test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am in after class");
	}
	
	@BeforeMethod
	public void beforeMethos() {
		System.out.println("I am in before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in after method");
	}

}
