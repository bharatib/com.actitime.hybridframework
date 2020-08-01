package com.acti.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelHelper {
	
	XSSFWorkbook excel;
	
	public ExcelHelper() {
		
		try {
			File src = new File("./testdata/actitime.xlsx");
			FileInputStream FileInput = new FileInputStream(src);
			excel =new XSSFWorkbook(FileInput);
			
		}catch(Exception e)
		{
			System.out.println("Excel file could not load  "+ e.getMessage());
		}
	}
	

	//get the count of active rows
	public int getRowCount(int sheetnum) {
		int count = excel.getSheetAt(sheetnum).getLastRowNum()+1;
		return count;
				
	}
	
	public String getCelldata(int sheetnum, int row, int col) {
		
		String data=excel.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
		return data;
		
	}


}
