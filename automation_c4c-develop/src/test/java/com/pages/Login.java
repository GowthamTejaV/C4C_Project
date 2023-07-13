package com.pages;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login {
	private static Map<String, String> urlsData;
	public static Map<String, Map<String, String>> loginData;
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static final String FileTestData_Path = "./src/test/resources/Data/TestData.xlsx";

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

	private  Map<String, Map<String, String>> initLoginData(String role) {
		try {
			loginData = new HashMap<String, Map<String, String>>();

			String username = "";
			String password = "";
			String env = "";
			setExcelFile(FileTestData_Path,role); // Set the Excel file based on the environment name
			int rowCount = getRowCount();
			for (int i = 1; i < rowCount; i++) { // Iterate over the rows to find the matching user
				String userType = getCellData(i, 0);
				username = getCellData(i, 1);
				password = getCellData(i, 2);

				if (loginData.get(userType) == null) {
					loginData.put(userType, new HashMap<String, String>());
				}
				loginData.get(userType).put("usr", username);
				loginData.get(userType).put("psw", password);

			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return loginData;
	}

	public Map<String, String> getCredentials(String userType, String urlType) {
		Map<String, String> credentials = new HashMap<>();
		Map<String, Map<String, String>> lgData = initLoginData(urlType);
		String url = initURL().get(urlType);
		String userName = lgData.get(userType).get("usr");
		String psw = lgData.get(userType).get("psw");
		credentials.put("userid", userName);
		credentials.put("password", psw);
		credentials.put("url", url);
		return credentials;
	}

}
