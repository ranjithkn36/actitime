package tyss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserInput {
//	Select menu using user input:
		public static void main(String[] args) throws InterruptedException
		{
		 
		  WebDriver driver=new ChromeDriver();
		  driver.get("file:///F:/CS/hotel.html");
		  WebElement MTRListBox = driver.findElement(By.id("mtr"));
		  HashSet<String> allText=new HashSet<String>();
		  Select s=new Select(MTRListBox);
		   List<WebElement> Alloptions = s.getOptions();
		  int size = Alloptions.size();
		  WebElement option=null;
		  List<String> singleElementList = new ArrayList<String>();
		  List<String> DuplicateElementList = new ArrayList<String>();
		  for(int i=0;i<size;i++) {
		    option = Alloptions.get(i);
		   String text = option.getText(); 
		   if(allText.add(text)==false) {
		    DuplicateElementList.add(text);
		   }
		   else {
		    singleElementList.add(text);   
		   }   
		  }
		  System.out.println("duplicates >"+DuplicateElementList);
		  System.out.println("singles "+singleElementList);
		Scanner sc = new Scanner(System.in);
		  System.out.println("Please enter the dish to check availabiliy");
		  String serchDish = sc.next(); 

		  for(int i=0;i<singleElementList.size();i++) {
		   if(serchDish.equalsIgnoreCase(singleElementList.get(i))) {
		    System.out.println("This dish is availble "+serchDish); 
		   }
		  }
		  for(int i=0;i<DuplicateElementList.size();i++) {
		  if(serchDish.equalsIgnoreCase(DuplicateElementList.get(i))) {
		   System.out.println(" This dish is also duplicated");
		  
		  }
		  }
		  Thread.sleep(2000);
		  driver.close();
		  }
		  
		}
		 
		  
		

	
	
	


