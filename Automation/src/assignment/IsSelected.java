package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	 static
	 {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	 
	 }
	 public static void main(String[] args) {
		 WebDriver driver = new  ChromeDriver();
		  driver.get("https://www.facebook.com/");
		   boolean iS = driver.findElement(By.id("u_0_7")).isSelected();
                     if(iS)
                     {
                    	 System.out.println("male radiobutton is selected");
                     }
                     else {
                    	 System.out.println("male radiobutton not selected");
                    	 
                    	 
                    	 
                     }
                         driver.quit();
	}
	
	
	
	
	

}
