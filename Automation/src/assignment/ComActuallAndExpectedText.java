package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComActuallAndExpectedText {

	 static
	 {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	 
	 }
	 public static void main(String[] args) {
		 String ExpectedTxt="demo@opensourcebilling.org";
		 WebDriver driver = new  ChromeDriver();
		  driver.get("http://demo.opensourcebilling.org/");
		   String actualText = driver.findElement(By.id("email")).getAttribute("value");
                 if (actualText .equals(ExpectedTxt)) {
                	 System.out.println("pass");
                    	 
                     }
                 else {
                	 System.out.println("fail");
                	 
                 }
                         driver.quit();
	}
}
