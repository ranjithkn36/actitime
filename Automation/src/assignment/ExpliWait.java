package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliWait {
	 static {
    	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
     }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		WebDriver driver =new ChromeDriver();
		driver.get("http://amazon.in/");
		driver.manage().window().maximize();
		 WebElement Element = driver.findElement(By.id("a-autoid-0-announce"));
		  WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(Element));
		           Element.click();
		           Thread.sleep(20);
		           
		           
		driver.close();
		 
	}

}
