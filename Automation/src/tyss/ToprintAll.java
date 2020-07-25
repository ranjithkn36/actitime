package tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToprintAll{
	static { System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[]args) {
		
		WebDriver driver =new ChromeDriver();
		 driver.get(" http://amazon.in/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		 System.out.println(alllinks.size());
		 for(int i=0;i<=alllinks.size();i++) {

			System.out.println(alllinks.get(i).getText()+" ---"+alllinks.get(i).getAttribute("href")); 
		 }
		driver.close();
	}}

