package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelwrite {
	public static void main(String[] args) throws IOException {
		 FileInputStream fis =new FileInputStream("./Data/Book.xlsx");
		    Workbook wb = WorkbookFactory.create(fis);
		     wb.getSheet("createcustomer").getRow(2).getCell(1).setCellValue("ranjith");
		     FileOutputStream fos=  new FileOutputStream("./Data/Book.xlsx");
		     wb.write(fos);
		     wb.close();
		     
}
}
