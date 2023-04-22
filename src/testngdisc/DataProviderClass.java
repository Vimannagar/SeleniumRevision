package testngdisc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	
	@DataProvider(name = "testdata")
	public static String[][] dataSet() throws IOException
	{
		
		
		String path = "F:\\Desktop\\VimanNagar\\Revision session\\TestData.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		String s = sh1.getRow(0).getCell(0).getStringCellValue();
		
		int rowcount = sh1.getLastRowNum()+1;
		
		System.out.println(rowcount);
		
		int columncount = sh1.getRow(0).getLastCellNum();
		
		System.out.println(columncount);
		
		
		String [][] data = new String [rowcount][columncount];
		
		for(int i=0; i<rowcount; i++)
		{
			for(int j=0; j<columncount; j++)
			{
			data[i][j]	= sh1.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
			
		
	}
	
	public static void main(String[] args) throws IOException {
		dataSet();
	}
	
	

}
