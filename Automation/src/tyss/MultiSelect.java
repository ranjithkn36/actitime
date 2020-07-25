package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	
	
	
		 static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
		      }
		public static void main(String[] args) throws InterruptedException {
		    //open the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/CS/hotel.html");
		WebElement MTRListBox = driver.findElement(By.id("mtr"));

		Select s=new Select(MTRListBox); 
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("v");
		Thread.sleep(2000);
		s.selectByVisibleText("Dosa");

		s.deselectByIndex(0);
		s.deselectByVisibleText("Vada");
		s.deselectByValue("d");
		}
		}


