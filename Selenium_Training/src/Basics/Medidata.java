package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Medidata {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM DOWNLOADS\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://sandbox.imedidata.net/");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement username=driver.findElement(By.id("session_username"));
		username.sendKeys("vthiru");
		WebElement pw=driver.findElement(By.id("session_password"));
		pw.sendKeys("Niranjana@19");

		WebElement login=driver.findElement(By.id("create_session_link"));
		login.click();
		Thread.sleep(1000);					

		WebElement CSATreatitol=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div[2]/div/a"));
		CSATreatitol.click();
		Thread.sleep(1000);

		WebElement createdesign=driver.findElement(By.xpath("//*[@id=\"spa\"]/div/div[2]/button"));
		createdesign.click();
		Thread.sleep(1000);

		WebElement untitleddesign1=driver.findElement(By.xpath("//*[@id=\"spa\"]/div/div[2]/div[2]/div/div[1]/div/div[1]/h1/span/i"));
		untitleddesign1.click();

		WebElement untitleddesign2=driver.findElement(By.xpath("//*[@id=\"popover-contained\"]/div[2]/input"));
		untitleddesign2.clear();
		untitleddesign2.sendKeys("Test3");

		WebElement designclick=driver.findElement(By.xpath("//*[@id=\"popover-contained\"]/div[2]/button[1]/i"));
		designclick.click();

		WebElement header =driver.findElement(By.xpath("//*[@id=\"spa\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/button[1]"));
		header.click();

		WebElement headername=driver.findElement(By.xpath("//*[@id=\"component-name-edit\"]"));
		headername.sendKeys("arun");

		WebElement AE=driver.findElement(By.xpath("//*[@id=\"configuration-tabs-pane-data-options\"]/div/div/div[2]/div/div[1]/div[1]"));
		AE.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		Actions act =new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[text()='subject_uuid (subject_uuid)']"));
		WebElement dest=driver.findElement(By.xpath("//div[text()='Column 1']//following::div[text()='Drag variable here'][1]"));
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"configuration-tabs-pane-data-options\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[2]"));
		WebElement dest1=driver.findElement(By.xpath("//*[@id=\"spa\"]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[1]/div/div[2]/div[1]/div/div[2]/div"));
		WebElement source2=driver.findElement(By.xpath("//*[@id=\"configuration-tabs-pane-data-options\"]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]"));
		WebElement dest2=driver.findElement(By.xpath("//*[@id=\"spa\"]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[1]/div/div[2]/div[1]/div/div[3]/div"));
		
		System.out.println(source.getLocation());
		System.out.println(dest.getLocation());
		//act.dragAndDrop(source, dest).build().perform();


		final String java_script =
				"var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
						"ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
						"ction(format,data){this.items[format]=data;this.types.append(for" +
						"mat);},getData:function(format){return this.items[format];},clea" +
						"rData:function(format){}};var emit=function(event,target){var ev" +
						"t=document.createEvent('Event');evt.initEvent(event,true,false);" +
						"evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
						"dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
						"'drop',tgt);emit('dragend',src);";
		js.executeScript(java_script, source, dest);
		Thread.sleep(2000);
		js.executeScript(java_script, source1, dest1);
		Thread.sleep(2000);
		js.executeScript(java_script, source2, dest2);
		Thread.sleep(2000);
		
		WebElement save = driver.findElement(By.xpath("//*[@id=\"spa\"]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[1]/div/div[3]/button[1]"));
		save.click();
	//	js.executeScript("window.scrollBy(0,250)");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		WebElement table = driver.findElement(By.className("dropdown-toggle btn btn-default"));
		table.click();
		
		WebElement widetable = driver.findElement(By.xpath("//*[@id=\"spa\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[1]/a"));
		widetable.click();
		
	}
}