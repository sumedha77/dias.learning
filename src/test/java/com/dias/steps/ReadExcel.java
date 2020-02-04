package com.dias.steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
		 	 
		 static XSSFWorkbook excelWorkbook;
		 static XSSFSheet ExcelWSheet;
		 
		 @Test
			public static void rexcel() throws IOException, FileNotFoundException{
				System.out.println("Value of array is:-");
			 FileInputStream file = new FileInputStream("D:\\Others\\TestData.xlsx");
			  excelWorkbook = new XSSFWorkbook(file);
			  ExcelWSheet= excelWorkbook.getSheetAt(0);
			
			  Iterator<Row> Drow =  ExcelWSheet.iterator();
			  while (Drow.hasNext()){
				 Row row = Drow.next();
				 Iterator<Cell> dcell =  row.iterator();
				 while (dcell.hasNext()) {
					System.out.println(dcell.next());
					System.out.println();
					
						
				}
		 }
		}
			/*public static void roneexcel() throws IOException, FileNotFoundException{
				int rowcount;
				XSSFRow row;
				XSSFCell cell;
				short cellcount;
				
				rowcount= ExcelWSheet.getLastRowNum();
				
				for (int i=0;i<rowcount+1;i++){
				row= ExcelWSheet.getRow(i);
				cellcount= row.getLastCellNum();
					for (int j=0;j<cellcount;j++){
						cell= row.getCell(j);
						System.out.println("Cell values"+ cell);
					}
				 }
			}*/
			

	}


