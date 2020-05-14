package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportExample {

	WebDriver driver;
	ExtentReports extentreports;
	ExtentHtmlReporter htmlreporter;
	ExtentTest testcase;
	
	

	@BeforeSuite
	public void launchbrowser() {
		extentreports=new ExtentReports();
		htmlreporter =new ExtentHtmlReporter("ExtentReports.html");
		extentreports.attachReporter(htmlreporter);
		
		long StartTime=System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		driver = new ChromeDriver();	
	}

	@Test
	public void opengoogle() {
		testcase=extentreports.createTest("open google");
		driver.get("https://www.google.com/");
		testcase.log(Status.INFO, "navigates to google");
		testcase.log(Status.PASS, "actual result comes");
	}

	@Test
	public void openBing() {
		testcase=extentreports.createTest("open bing");
		
		driver.get("https://www.bing.com/");
		testcase.log(Status.PASS, "actual result");
		testcase.log(Status.INFO, "navigates to bing");
	}

	@Test
	public void openyahoo() {
		testcase =extentreports.createTest("open yahoo");
		driver.get("https://www.yahoo.com/");
		testcase.log(Status.PASS, "actual results");
		testcase.log(Status.INFO, "navigates to yahoo");
	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();

		long EndTime=System.currentTimeMillis();
		extentreports.flush();
	//	long totalTime= EndTime-StartTime;
	//	System.out.println("Total time taken"+ totalTime);

	}



}


