package tyss;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitle {
   static {
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
   }
	public static void main(String[] args) {
	   WebDriver driver =new ChromeDriver();
	    driver.get(" https://www.naukri.com/");
	              Set<String> wh = driver.getWindowHandles();
	              for(String w:wh) {
	            	          driver.switchTo().window(w);
	            	          String title = driver.getTitle();
	            	          System.out.println(title);
	              }
           driver.quit();
	}

}
