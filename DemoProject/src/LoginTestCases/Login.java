package LoginTestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//DataProvider major role playing in datadriven testing

public class Login {

	String[][] data=	{
			{"admin","admin"},
			{"Admin1","dummy"},
			{"Admin","admin"},
			{"Admin","admin1"},
	};

	@DataProvider(name="logindata")
	public String[][] dataprovider() {
		return data;

	}

	@Test(dataProvider ="logindata" )
	public void Logincorrect(String uName,String PW) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement Login=driver.findElement(By.id("txtUsername"));
		Login.sendKeys(uName);


		WebElement pw=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pw.sendKeys(PW);

		driver.findElement(By.id("btnLogin")).click();
		driver.close();
	}
}

