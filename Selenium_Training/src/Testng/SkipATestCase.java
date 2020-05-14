package Testng;

import org.testng.annotations.Test;

public class SkipATestCase {


	@Test(priority=1)
	public void startacar() {
		System.out.println("start the car");
	}
	
	

	@Test(priority=4,enabled = false)   //v are skip a testcase here by enabled = false
	public void turnmusicon() {
		System.out.println("music on");
	}
	
	@Test(priority=2)
	public void putfirstgear() {
		System.out.println(" first gear");
	}

	@Test(priority=3)
	public void putsecondgear() {
		System.out.println(" second gear");
	}


}


