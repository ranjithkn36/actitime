package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {


	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/Disabled.html");	
		driver.findElement(By.id("t1")).sendKeys("admin");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		//enter manager in pw disabled textbox
		j.executeScript("document.getElementById('t2').value='manager'");
		//click on Login Button using java script
		j.executeScript("document.getElementById('t3').click()");
		
		}
}
	
	
	
	
	
	

