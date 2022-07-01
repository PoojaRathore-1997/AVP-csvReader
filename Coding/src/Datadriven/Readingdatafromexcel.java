package Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;


public class Readingdatafromexcel {

	public static void main(String[] args) throws IOException
	{
	
		
	FileInputStream file= new FileInputStream("C:\\Excelcode\\readfile.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet= workbook.getSheet("Sheet1");   //providing sheet name
    
    int rowcount=sheet.getLastRowNum();  //return the row count
//    System.out.println(rowcount);
    int colcount=sheet.getRow(0).getLastCellNum();   //returns column/cell count
    System.out.println(colcount);
    
    for(int i=0; i<rowcount; i++) 
    {
    	XSSFRow currentrow =sheet.getRow(i);    //focus on current row
    	for(int j=0;j<colcount;j++) 
    	{
    	String value=currentrow.getCell(j).toString();   //read a value from the cell 
    	System.out.print(" "  +value);
    	}
    	System.out.println();
    	
    }
    
	}
	
	
}