package AVPExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		File file = new File("C:\\Excelcode\\tournament.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
	    int rowcount=sheet.getLastRowNum();  //return the row count
		System.out.println(rowcount);
	    int colcount=sheet.getRow(1).getLastCellNum();   //returns column/cell count
	    System.out.println(colcount);
	    
	    String[] data = new String[colcount];
	    for ( int i = 0; i < colcount; i++)
	    {
	    	data[i] = sheet.getRow(2).getCell(i).toString();
//	    	System.out.println(data[i]);
//		    driver.findElement(By.cssSelector(".event-input")).sendKeys();
//		    driver.findElement(By.id("exampleFormControlTextarea1")).click();
//		    //description//
//		    driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("Event");

	    	
	    	
//			Iterator<Row> rowIterator= sheet.iterator();
//			while(rowIterator.hasNext())
//              {
//				Row row= rowIterator.next();
//				Iterator<Cell>cellIterator= row.cellIterator();
//				while(cellIterator.hasNext())
//				{
//					Cell cell= (Cell )cellIterator.next();
//					switch(cell.getCellType())
//					{
//					case NUMERIC:
//					 System.out.print(cell.getNumericCellValue()+"\t");
//					break;			    
//					case STRING :System.out.print(cell.getStringCellValue()+"\t");
//				                  break;
//					
//					}
//				}
//				
//            	 System.out.println(""); 
//			}
			file.close();
		} 
		
	    }

	}

}
