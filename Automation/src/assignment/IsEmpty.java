package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEmpty {
	 static
	 {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	 
	 }
	 public static void main(String[] args) {
		 WebDriver driver = new  ChromeDriver();
		  driver.get("https://www.facebook.com/");
		   String im= driver.findElement(By.id("email")).getAttribute("value");
                     if(im.length()==0)
                     {
                    	 System.out.println("testisEmpty");
                     }
                     else {
                    	 System.out.println("testisnotEmpty");
                    	 
                    	 
                    	 
                     }
                         driver.quit();
	}
	
	

}
