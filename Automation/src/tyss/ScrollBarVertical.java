package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarVertical {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
			public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bbc.com/");
			Thread.sleep(7000);
			int y = driver.findElement(By.xpath("//a[contains(text(),'Europe and US line')]")).getLocation().getY();
			JavascriptExecutor j=(JavascriptExecutor) driver;
           
			j.executeScript("window.scrollTo(0,"+y+")");
			}
}

