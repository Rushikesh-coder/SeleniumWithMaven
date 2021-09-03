package com.excelDataReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	public void userData() throws IOException {
		String excelFilePath = "src/test/resources/configuration/eclipseExample.xlsx";
		FileInputStream fileInputStream = new FileInputStream(excelFilePath);

		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator iterator = sheet.iterator();

		while (iterator.hasNext()) {
			XSSFRow row = (XSSFRow) iterator.next();

			Iterator cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIterator.next();

				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		ExcelDataReader objExcelDataReader = new ExcelDataReader();
		objExcelDataReader.userData();
	}
}
