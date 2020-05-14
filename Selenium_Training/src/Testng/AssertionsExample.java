package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

	String name ="arun";
	boolean value=false;

	@Test
	public void CheckEqual() {
		//		if(name.equals("arun")) {
		//			System.out.println("name is equal");
		//		}else {
		//			System.out.println("name is not equal");
		//		}

		Assert.assertEquals(name,"arun");					//asserteequals means if the givenvalue is equal or not
		//Assert.assertTrue(value, "this message false");    //asserttrue means if v expect true value means v use asserttrue
		//Assert.assertFalse(value, "this message false");	//asserttrue means if v expect false value means v use asserttrue
	}
}


