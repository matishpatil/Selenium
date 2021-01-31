package data;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
	}
	
	  @Test (dataProvider = "data-provider")
	    public void myTest (int a, int b, int result) {
	        int sum = a + b;
	        System.out.println("Value of a is " + a);
	        System.out.println("Value of b is " + b);
	        System.out.println(sum);
	        Assert.assertEquals(result, sum);
	    }
}
