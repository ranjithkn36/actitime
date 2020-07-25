package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	
		 static {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		      }
		  public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.services.irctc.co.in/homebody.html");
		  driver.findElement(By.id("details-button")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("proceed-link")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("button")).click();
		  Thread.sleep(3000);
		  String text = driver.switchTo().alert().getText();
		  driver.switchTo().alert().accept();
		  System.out.println(text);
		  driver.close();
		   }
		}


