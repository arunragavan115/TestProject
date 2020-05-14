package Basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");	
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//get the xyposition
		WebElement getpositionButton= driver.findElementById("position");
		
		
		Point xypoint= getpositionButton.getLocation();
		int xvalue= xypoint.getX();
		int yvalue=xypoint.getY();
		
		System.out.println("x value is:"+ xvalue + "y value is:"+yvalue);
		
		//find color

		WebElement colorbutton=driver.findElementById("color");
		String color=colorbutton.getCssValue("background-color");
		
		System.out.println("button color is :"+color);
		
		//find height and width
		
		WebElement sizebutton=driver.findElementById("size");
		int height=sizebutton.getSize().getHeight();
		int width=sizebutton.getSize().getWidth();	

		System.out.println("height is:" +height  +  "width is :"+width );
		
		// go to homepage
		WebElement homepage=driver.findElementById("home");
		homepage.click();

		
}
}