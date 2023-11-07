package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getData(String path,String sheet,int r,int c)
	{
		String v="";
		try 
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return v;
	}
	
	public static int getRowCount(String path,String sheet)
	{
		int rowCount=0;
		
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			rowCount=wb.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return rowCount;
	}
	
	
	//add a method to count columns
	public static int getColumnsCount(String path,String sheet,int row,int cell) {
		int columnCount=0;
		 
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			 wb.getSheet(sheet).getRow(row).getCell(cell);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		
		return columnCount;
		
	}
	
	//method to write the data
	
}
