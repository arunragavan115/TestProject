package Testng;

import org.testng.annotations.Test;

public class DependanciesManagement {

	@Test(enabled = true)
	public void highschool( ) {
		System.out.println("high school");
	}
	@Test(dependsOnMethods = "highschool")  // if dependsonmethod is true code will work
	public void highersecondary() {
		System.out.println("higher secondary");
	}

	@Test(dependsOnMethods = "highersecondary")
	public void enggineering() {
		System.out.println("engg");
	}

}
