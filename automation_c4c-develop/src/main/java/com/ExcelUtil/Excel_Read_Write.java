package com.ExcelUtil;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Write {
	
	
	private static Map<String, String> urlsData;
	private static Map<String, Map<String, String>> loginData;
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static final String FileTestData_Path = "/Users/gowthamtejavuppalapati/git/C4C_Project/automation_c4c-develop/src/test/resources/Data/TestData.xlsx";

	
	
	private static void setExcelFile(String Path, String SheetName) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			throw (e);
		}
	}

	private static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			CellType dataType = Cell.getCellType();
			if (dataType == CellType.STRING) {
				return Cell.getStringCellValue();
			} else {
				throw new Exception("");
			}
		} catch (Exception e) {
			throw (e);
		}
	}

	private static int getRowCount() {
		return ExcelWSheet.getPhysicalNumberOfRows();
	}

	// -------------------------------------------------
	private Map<String, String> initURL() {
		try {
			String url = "";
			urlsData = new HashMap<String, String>();
			String environment = " "; // Get the environment name from system properties
			if (environment != null) {
				setExcelFile(FileTestData_Path, "URLS");
				int rowCount = getRowCount();
				for (int i = 1; i < rowCount; i++) { // Iterate over the rows to find the matching user
					String userType = getCellData(i, 0);
					url = getCellData(i, 1);
					if (urlsData.get(userType) == null) {
						urlsData.put(userType, url);
					}
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return urlsData;
	}

	public Map<String, Map<String, String>> initData(String sheetName) {
		try {
			loginData = new HashMap<String, Map<String, String>>();

			String username = "";
			String password = "";
			String env = "";
			setExcelFile(FileTestData_Path,sheetName); // Set the Excel file based on the environment name
			int rowCount = getRowCount();
			
			
			for (int i = 1; i < rowCount; i++) { // Iterate over the rows to find the matching user
				String userType = getCellData(i, 0);
				username = getCellData(i, 1);
				password = getCellData(i, 2);

				if (loginData.get(userType) == null) {
					loginData.put(userType, new HashMap<String, String>());
				}
				
				int count=ExcelWSheet.getRow(i).getPhysicalNumberOfCells();
				for(int j=0;j<count;j++) {
					loginData.get(userType).put(getCellData(0, j), getCellData(i, j));
					
				}
			
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return loginData;
	}

}
