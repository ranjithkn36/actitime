package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateOfBirth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	 public static void main(String[] args) {
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 WebElement DayListBox = driver.findElement(By.id("day"));
		  Select s = new Select(DayListBox);
		  s.selectByVisibleText("21");
		  WebElement MonthListBox=driver.findElement(By.id("month"));
		  Select s1=new Select(MonthListBox);
		  s1.selectByVisibleText("Nov");
		  WebElement YearListBox=driver.findElement(By.id("year"));
		  Select s2=new Select(YearListBox);
			s2.selectByVisibleText("1996");
			driver.close();
			
	 }

}
