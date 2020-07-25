package tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDate {
	public static void main(String[] args) throws InterruptedException {
		  //open the chrome browser
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		  
		  driver.findElement(By.id("policynumber")).sendKeys("23567");
		  driver.findElement(By.id("dob")).click();  
		  
		  WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));  
		  Select s1=new Select(month);
		  s1.selectByVisibleText("Feb");
		  
		  WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));  
		  Select s2=new Select(year);
		  s2.selectByVisibleText("1992");
		  
		  driver.findElement(By.xpath("//a[.='8']")).click();
		  
		  
		  driver.findElement(By.id("alternative_number")).sendKeys("8796541336");
		  
		  driver.findElement(By.id("renew_policy_submit")).click();
		  Thread.sleep(4000);
		  driver.close();


}
}