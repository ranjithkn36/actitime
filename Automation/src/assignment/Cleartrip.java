package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		}

		public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.cleartrip.com/");
		 driver.findElement(By.name("origin")).sendKeys("ban");
		Thread.sleep(3000);
		 List<WebElement> category = driver.findElements(By.xpath("//li[@class='list']"));
		int count=category.size();
		 System.out.println(count);
		 for(WebElement a:category)
		 {
			 String t=a.getText();
			 System.out.println(t);
		 }
		     category.get(0).click();
			 Thread.sleep(5000);
			 driver.close();
			 }
}
		
