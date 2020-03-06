package org.samyak.com.generaicLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FilLib {
	
	@DataProvider
	public Object[][] getDatafromExcel() throws IOException{
		Object[][] arrayObject = getdata("Sheet1",1,1);
		return arrayObject;
		
	}
	@Test(dataProvider = "getDatafromExcel")
	public String[][] getdata(String sheetName , int rowNum , int celNum) throws IOException {
		String[][] excelData = null;
		System.out.println("............................................");
		FileInputStream f = new FileInputStream("F:\\EclipseOxygen\\makeMyTrip\\fileData\\fileData.xlsx");
		//XSSFWorkbook wb = (XSSFWorkbook)WorkbookFactory.create(f);
		XSSFWorkbook wb = new XSSFWorkbook();
		

		XSSFSheet sh = wb.getSheet(sheetName);
		XSSFRow rw = sh.getRow(rowNum);
		XSSFCell cel = rw.getCell(celNum);
		int rownum = sh.getLastRowNum();
		int celnum = rw.getLastCellNum();

		excelData = new String[rownum-1][celnum];
			
		for(int i=1;i<rownum;i++){
			for(int j=0;j<celnum;j++){
			excelData[i-1][j] = sh.getCellComment(i, j).toString();

			}
		}
		return excelData;	
	}

}
