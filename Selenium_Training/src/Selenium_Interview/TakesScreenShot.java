package Selenium_Interview;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver_exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement button =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		button.getClass();
		
		// v can take screenshot by 2 methods....1-takesscreenshot(FileHandler) 2-using java (robot)
		
		// takesscreenshot take only particular thing.
//		TakesScreenshot screenshot=(TakesScreenshot)driver;		 //takesscreenshot pass the driver to interface
//		File sourcefile=  screenshot.getScreenshotAs(OutputType.FILE); // to store a screenshot as file.
//		
//		File Destinationfile =new File("D://sample.png"); 		//to store which i have to save it a screenshot.
//		
//		FileHandler.copy(sourcefile, Destinationfile);        // using FileHandler v copy the screensot from sourcefile to destination 

		
		Robot robot =new Robot();							//using using robot java awt
		
		Dimension screensize =Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rectangle =new Rectangle(screensize);				//storing screensize in rectangle
		
		BufferedImage source =robot.createScreenCapture(rectangle); 
		
		File Destinationfile =new File("D://robot.jpeg");
		ImageIO.write(source, "jpeg", Destinationfile);
		
		
		
		
	}

}
