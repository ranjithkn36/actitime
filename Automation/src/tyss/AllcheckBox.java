package tyss;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllcheckBox {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {

		//Scanner s=new Scanner(System.in);0
		WebDriver driver=new ChromeDriver();
	driver.get("file:///F:/CS/checkbox.html");
	//	driver.get(s.nextLine());
	//	System.out.println("https://www.google.com/");

	  List<WebElement> a = driver.findElements(By.xpath("//input[@type='checkbox']"));
				for(int i=0;i<a.size();i++)
				{
					
					WebElement check=a.get(i);
					check.click();
					Thread.sleep(3000);
				}


 driver.close();
	}

}




