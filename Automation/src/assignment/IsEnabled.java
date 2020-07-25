package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        boolean login = driver.findElement(By.xpath("//div[.='Login ']")).isEnabled();
        if(login==true)
        {
        	System.out.println("pass");
        	
        }
        else
        {
        	System.out.println("fail");
        }
	}
}


