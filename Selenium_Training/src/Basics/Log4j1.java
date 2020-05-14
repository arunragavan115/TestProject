package Basics;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4j1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Logger log = Logger.getLogger(Log4j1.class.getName());
		DOMConfigurator.configure("Log4j_Sample.xml");
		
		log = Logger.getLogger("devpinoylogger"); 
		log.debug("start a selenium");
		log.info("inside before");
		log.info("hello");
		
		
	
		
		
//		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//		driver.navigate().to("http://fb.com/");
//		Thread.sleep(2000);
//		
//		WebElement wb=driver.findElement(By.name("email"));
//		Actions act = new Actions(driver);
//		
//		act.keyDown(Keys.SHIFT).build().perform();
//		act.sendKeys("arun@gmail.com");
//		act.keyUp(Keys.SHIFT).build().perform();
//		act.sendKeys("kumar");
//		
//		
//		 wb=driver.findElement(By.name("pass"));
//		 wb.sendKeys("asfkb");
//		 Thread.sleep(2000);
//		 
//		 
//		 wb=driver.findElement(By.className("uibutton"));
//		 
//		 wb.click();
//		 Thread.sleep(2000);
//		 
//		
//		
//		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
		
	}

}
