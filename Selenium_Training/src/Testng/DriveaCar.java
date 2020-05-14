package Testng;

import org.testng.annotations.Test;

public class DriveaCar {

		@Test(priority = 1)
	public void startacar() {
		System.out.println("start the car");
	}
	
		@Test(priority = 2, enabled = false)
	public void putfirstgear() {
		System.out.println(" first gear");
	}
	
		@Test(priority = 3)
	public void putsecondgear() {
		System.out.println(" second gear");
	}
	
		@Test(priority = 4)
	public void putthirdgear() {
		System.out.println(" third gear");
	}
	
		@Test(priority = 5)
	public void putfourthgear() {
		System.out.println("fourth gear");
	}
}
