package library;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary 
{
	public static Object[][] getData(String path,String sheetName)
	{
		FileInputStream fin;
		Object [][] arr = null;
		try {
			fin = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fin);
			Sheet sheet=wb.getSheet(sheetName);
			
			arr=new Object[sheet.getPhysicalNumberOfRows()][1];
			
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
					
					arr[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}
	
	public static String getValue(String path,String sheetName,int r, int c)
	{
		String value = " ";
		try {
			FileInputStream fin=new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fin);
			Sheet sheet=wb.getSheet(sheetName);
			
			value=sheet.getRow(r).getCell(c).getStringCellValue();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

}
