package Testng;

import org.testng.annotations.Test;

public class GroupingExample {


	/* scenario A big basket having a different kinds of mobile phones.
	 * let use assume there are apple , vivo, moto and lenovo
	 * i want run test only for vivo and moto . write a program for that */

	@Test (groups = "apple")
	public void apple() {
		System.out.println("apple");
	}

	@Test	(groups = "apple")
	public void apple2() {
		System.out.println("apple testing");		
	}

	@Test	(groups = "moto")				//in xml tag v give <include name = "moto"></include>  means this testcase only run
	public void moto1() {
		System.out.println("moto testing");
	}

	@Test	(groups = "moto")
	public void moto2() {
		System.out.println("moto testing");
	}

	@Test	(groups = "vivo")
	public void vivo1() {
		System.out.println("vivo testing");

	}
	@Test	(groups = "vivo")
	public void vivo2() {
		System.out.println("vivo testing");
	}

	@Test (groups = "lenovo")
	public void lenovo1() {
		System.out.println("lenovo testing");
	}

	@Test	(groups = "lenovo")
	public void lenovo2() {
		System.out.println("lenovo testing");
	}
}
