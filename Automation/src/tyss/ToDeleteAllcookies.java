package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDeleteAllcookies {
static {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://amazon.in/");
		Thread.sleep(3000);
		 driver.manage().deleteAllCookies();
		 driver.close();

	}

}
