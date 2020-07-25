package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	public  static void main(String[]args) throws IOException {
		 FileInputStream fis = new FileInputStream("./Data/commondata.property");
		  Properties p = new Properties();
		   p.load(fis);
		   String text = p.getProperty("password");
		   System.out.println(text);
		 
	}

}
