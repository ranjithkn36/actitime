package assignment;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel {

	public static void main(String[] args) throws IOException {
		//  get java object in read mode
		 FileInputStream fis =new FileInputStream("./Data/Book.xlsx");
       Workbook wb = WorkbookFactory.create(fis);
          String value = wb.getSheet("createcustomer").getRow(2).getCell(1).getStringCellValue();
               System.out.println(value);
               wb.close();
          
	}

}
