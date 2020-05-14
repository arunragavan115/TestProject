package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider = "dp")
	public void f1(String arun, String ragavan) {
		System.out.println(arun + "" + ragavan);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] {"mani" ,"vel"},
			new Object[] {"kishore","kumar"},

		};

	}

}
