package assignment;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/Mhotel.html");
		WebElement MTRListBox = driver.findElement(By.xpath("//select[@id='mtr']"));
		HashSet<String>AllText=new HashSet<>();
		Select s=new Select(MTRListBox);
	 List<WebElement> Alloptions = s.getOptions();
		int count=Alloptions.size();
		for(int i=0;i<count;i++)
		{
			WebElement option=Alloptions.get(i);
			String text=option.getText();
			if(AllText.add(text)==true)
			{
				System.out.println(text);
			}
			
		}
		driver.close();

	}	
}
