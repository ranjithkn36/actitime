package tyss;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 ChromeDriver driver = new  ChromeDriver();
		  driver.get("https://web.whatsapp.com/");
           driver.close();
           SearchContext  se;
           WebDriver  w;
           JavascriptExecutor j;
           
           
	}

}
