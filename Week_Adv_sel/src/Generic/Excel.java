package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
public static String get_data(String sheet, int rnum, int cnum)
{
	String val ="";
	try
	{
		FileInputStream fis = new FileInputStream("./excel/test_data");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		for(int i=0 ;i<8;i++)
		{
			
		}
		
	}
}
}
