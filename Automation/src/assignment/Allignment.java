package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point mobilenum = driver.findElement(By.xpath("//input[@name='reg_email__']")).getLocation();
		Point password=driver.findElement(By.xpath("//input[@name='reg_passwd__']")).getLocation();
		int x=mobilenum.getX();
		int x2=password.getX();
		
		System.out.println(x);
		System.out.println(x2);
		driver.close();
	}

}

