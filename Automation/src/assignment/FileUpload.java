package assignment;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
		      }
		public static void main(String[] args) throws InterruptedException {
		    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		File f=new File("./Data/ran1.docx");
		String Absolutepath=f.getAbsolutePath();
		driver.findElement(By.xpath("//label[@id='wdgt-file-upload']")).sendKeys(Absolutepath);
		

}}
