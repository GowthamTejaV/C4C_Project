package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static int headerRow = 0;
	public static int startRow = 0;
	public static int endRow = 0;
	public static int columnCount = 0;
	public static List<String> header = new ArrayList<String>();
	public static HashMap<String, ArrayList<String>> testData = new HashMap<String, ArrayList<String>>();

	// public static HashMap<String, String> data = null;
	public static LinkedList<List<String>> iterationCount(String workbookName, String sheetName)
			throws EncryptedDocumentException, IOException {
		header.clear();

		LinkedList<List<String>> dataSet = new LinkedList<>();
		Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(new File("./src/test/resources/data/" + workbookName));
			// Getting the Sheet at index zero
			Sheet sheet = workbook.getSheet(sheetName);

			headerRow = 0;
			startRow = 1;
			columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("columnCount:- " + columnCount);
			endRow = sheet.getLastRowNum();
			System.out.println("endRow:- " + endRow);
			for (int k = 0; k < columnCount; k++) {
				header.add(sheet.getRow(0).getCell(k).toString());
			}

			for (int m = 1; m <= endRow; m++) {
				List<String> valuesList = new ArrayList<String>();
				for (int n = 0; n < columnCount; n++) {
					DataFormatter formatter = new DataFormatter();
					String value = formatter.formatCellValue(sheet.getRow(m).getCell(n));
					// String value ="";
					// Cell cell = sheet.getRow(m).getCell(n);
					// if (cell.getCellType() == CellType.NUMERIC) {
					// value = formatter.formatCellValue(cell); if
					// (HSSFDateUtil.isCellDateFormatted(cell)) {
					// SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
					// Date date = cell.getDateCellValue();
					// //cellValue = df.format(date);
					// value = df.format(date);
					// }
					// System.out.println(value);
					// }
					// else{
					// value = formatter.formatCellValue(cell);
					// }
					valuesList.add(value);
				}
				dataSet.add(valuesList);
			}

		} finally {
			// Close the workBook
			workbook.close();
		}
		return dataSet;
	}

	public static String readDataFile(String workbookName, String sheetName, String columnName, int rowNo)
			throws EncryptedDocumentException, IOException {

		int columnNo = 0;
		String value = null;

		Workbook workbook = WorkbookFactory.create(new File("./src/test/resources/data/" + workbookName));
		Sheet sheet = workbook.getSheet(sheetName);

		DataFormatter formatter = new DataFormatter();
		Row firstRow = sheet.getRow(headerRow);
		for (Cell c : firstRow) {
			if (columnName.equals(formatter.formatCellValue(c))) {
				columnNo = c.getColumnIndex();
				break;
			}

		}
		rowNo = rowNo - 1;
		String columnValue = sheet.getRow(rowNo).getCell(columnNo).getStringCellValue().trim();
		System.out.println("Column Value:- " + columnValue);
		value = sheet.getRow(rowNo).getCell(columnNo).getStringCellValue().trim();
		workbook.close();
		if (value.length() == 0) {
			return null;
		} else {
			return value;
		}
	}

	public static Integer readIntDataFile(String workbookName, String sheetName, String columnName, int rowNo)
			throws EncryptedDocumentException, IOException {

		int columnNo = 0;
		Integer value = null;

		Workbook workbook = WorkbookFactory.create(new File("./src/test/resources/data/" + workbookName));
		Sheet sheet = workbook.getSheet(sheetName);

		DataFormatter formatter = new DataFormatter();
		Row firstRow = sheet.getRow(headerRow);
		for (Cell c : firstRow) {
			if (columnName.equals(formatter.formatCellValue(c))) {
				columnNo = c.getColumnIndex();
				break;
			}

		}
		rowNo = rowNo - 1;
		value = Integer.parseInt(formatter.formatCellValue(sheet.getRow(rowNo).getCell(columnNo)));
		workbook.close();

		return value;
	}

	public static Long readlongDataFile(String workbookName, String sheetName, String columnName, int rowNo)
			throws EncryptedDocumentException, IOException {

		int columnNo = 0;
		Long value = null;

		Workbook workbook = WorkbookFactory.create(new File("./src/test/resources/data/" + workbookName));
		Sheet sheet = workbook.getSheet(sheetName);

		DataFormatter formatter = new DataFormatter();
		Row firstRow = sheet.getRow(headerRow);
		for (Cell c : firstRow) {
			if (columnName.equals(formatter.formatCellValue(c))) {
				columnNo = c.getColumnIndex();
				break;
			}

		}
		rowNo = rowNo - 1;
		value = Long.parseLong(formatter.formatCellValue(sheet.getRow(rowNo).getCell(columnNo)));
		workbook.close();

		return value;
	}

	// public static LinkedList<List<String>> iterationCount(String workbookName,
	// String sheetName)
	// throws EncryptedDocumentException, IOException {
	// LinkedList<List<String>> dataSet = new LinkedList<>();
	// Workbook workbook = null;
	// try {
	// workbook = WorkbookFactory.create(new File("./src/test/resources/data/" +
	// workbookName));

	// // Getting the Sheet at index zero
	// Sheet sheet = workbook.getSheet(sheetName);

	// headerRow = 0;
	// startRow = 1;
	// columnCount = sheet.getRow(0).getPhysicalNumberOfCells();

	// endRow = sheet.getLastRowNum();

	// for (int k = 0; k < columnCount; k++) {
	// header.add(sheet.getRow(0).getCell(k).toString());
	// }
	// System.out.println("endRow:- " + endRow);
	// List<String> valuesList = new ArrayList<String>();
	// for (int k = 1; k <= endRow; k++) {
	// for (int l = 0; l < columnCount; l++) {
	// DataFormatter formatter = new DataFormatter();
	// valuesList.add(formatter.formatCellValue(sheet.getRow(k).getCell(l)));
	// System.out.println("valuesList:- " + valuesList);
	// }
	// }
	// // System.out.println("valuesList:- " + valuesList);
	// dataSet.add(valuesList);
	// // System.out.println("dataSet:- " + dataSet);
	// } finally {
	// // Close the workBook
	// workbook.close();
	// }
	// return dataSet;
	// }

	public static int getNoOfRecords(String workbookName, String sheetName)
			throws EncryptedDocumentException, IOException {
		FileInputStream inputStream = new FileInputStream(new File("./test-output/" + workbookName));
		Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();
		return rowcount;
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		try {
			Workbook workbook = null;
			Sheet sheet = null;

			int columnNo = 0;
			String value = null;

			workbook = WorkbookFactory.create(new File("./src/test/resources/data/Bookings.xlsx"));

			// Getting the Sheet at index zero

			sheet = workbook.getSheet("Complete");

			headerRow = 0;
			startRow = 1;
			columnCount = sheet.getRow(0).getPhysicalNumberOfCells();

			endRow = sheet.getLastRowNum();

			for (int k = 0; k < columnCount; k++) {
				header.add(sheet.getRow(0).getCell(k).toString());
			}
			System.out.println("endRow:- " + endRow);
			List<String> valuesList = new ArrayList<String>();
			for (int k = 1; k <= endRow; k++) {
				for (int l = 0; l < columnCount; l++) {
					DataFormatter formatter = new DataFormatter();
					valuesList.add(formatter.formatCellValue(sheet.getRow(k).getCell(l)));
					System.out.println("valuesList:- " + valuesList);
				}
			}
			// System.out.println("valuesList:- " + valuesList);
			// dataSet.add(valuesList);
			// System.out.println("dataSet:- " + dataSet);
		} finally {
			// Close the workBook
			// workbook.close();
		}
	}

	/**
	 * Read excel data First row is header, remaining columns test data Test data
	 * add to ArrayList<String> Header save to String using HashMap<String,
	 * ArrayList<String>> testData = new HashMap<String, ArrayList<String>>()
	 * 
	 * @author nouroji.nethaji
	 * @param filePath
	 * @param fileName
	 * @param sheetName
	 * @throws Exception
	 */
//	public static void readTestData(String filePath, String fileName, String sheetName) throws Exception {
//
//		String getFilePath = filePath + "/" + fileName;
//		File file = new File(getFilePath);
//		FileInputStream inputStream = new FileInputStream(file);
//		Workbook workbook = null;
//		String fileExtensionName = fileName.substring(fileName.indexOf("."));
//		if (fileExtensionName.equals(".xlsx")) {
//			workbook = new XSSFWorkbook(inputStream);
//		} else if (fileExtensionName.equals(".xls")) {
//			workbook = new HSSFWorkbook(inputStream);
//		}
//		Sheet sheet = workbook.getSheet(sheetName);
//		try {
//			Row headerRow = sheet.getRow(0);
//			for (int col = 0; col < headerRow.getLastCellNum(); col++) {
//				String header = headerRow.getCell(col).getStringCellValue().trim();
//				ArrayList<String> dataList = null;
//				try {
//					if (!header.isBlank() || !header.isEmpty() || header != null || header != "") {
//						int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
//						dataList = new ArrayList<String>();
//						for (int i = 1; i < rowCount + 1; i++) {
//							Row DataRow = sheet.getRow(i);
//							try {
//								String data = DataRow.getCell(col).getStringCellValue().trim();
//								if (!data.isBlank() || !data.isEmpty() || data != null || data != "") {
//									dataList.add(data);
//								} else {
//									break;
//								}
//							} catch (Exception e) {
//								break;
//							}
//						}
//					}
//				} catch (Exception e) {
//					break;
//				}
//				if (dataList.size() != 0 && header != "") {
//					testData.put(header, dataList);
//				}
//			}
//		} catch (Exception e) {
//			workbook.close();
//
//		} finally {
//			workbook.close();
//		}
//	}


	public LinkedHashMap<String, String> readExcelData(String tcKey) {
		LinkedHashMap<String, String> readTestData = new LinkedHashMap<String, String>();
		try {
			LinkedHashMap<String, Integer> dataSheetDetails = null;

			String excelFilePath = "src/test/resources/Data/C4C_TestData.xlsx";
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet MasterSheet = null;
			MasterSheet = workbook.getSheet("Master");
			int rowMaster = 1;

			for (rowMaster = 1; rowMaster <= MasterSheet.getLastRowNum(); rowMaster++) {

				if (MasterSheet.getRow(rowMaster).getCell(0).getStringCellValue().equalsIgnoreCase(tcKey)) {
					dataSheetDetails = new LinkedHashMap<String, Integer>();
					for (int col = 1; col < MasterSheet.getRow(rowMaster).getLastCellNum(); col++) {
						try {
							String fieldName = MasterSheet.getRow(rowMaster).getCell(col).getStringCellValue();
							String pageSheet = null;
							int pageRow = 0;
							if (fieldName.indexOf("_") > -1) {
								String getfield[] = fieldName.split("_");
								pageSheet = getfield[0];
								pageRow = Integer.parseInt(getfield[1]);
							}
							if (pageSheet != null) {
								dataSheetDetails.put(pageSheet, pageRow);
							}
						} catch (NullPointerException e) {
							break;
						}
					}
					break;
				}
			}

			for (Entry<String, Integer> set : dataSheetDetails.entrySet()) {
				XSSFSheet dataSheet = workbook.getSheet(set.getKey());
				String TCDataValue = "";
				for (int col = 0; col < dataSheet.getRow(set.getValue()).getLastCellNum(); col++) {
					try {
						String fieldName = dataSheet.getRow(0).getCell(col).getStringCellValue();
						String fieldValue = dataSheet.getRow(set.getValue()).getCell(col).getStringCellValue();
						if (!fieldValue.isEmpty()) {
							TCDataValue += fieldName + "=" + fieldValue + "@@";
						}
					} catch (Exception e) {

					}
				}
				readTestData.put(set.getKey(), TCDataValue);
				//System.out.println(set.getKey());
			}
			workbook.close();
			return readTestData;
		} catch (Exception e) {
			return readTestData;
		}
	}

	public static HashMap<String, ArrayList<String>> readExcel(String sheetName, boolean falg) throws Exception {
		HashMap<String, ArrayList<String>> testData = new HashMap<String, ArrayList<String>>();
		String excelFilePath = "./src/test/resources/Data/C4C_TestData.xlsx";
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		// XSSFSheet MasterSheet = null;
		Sheet sheet = workbook.getSheet(sheetName);
		try {
			Row headerRow = sheet.getRow(0);
			for (int col = 0; col < headerRow.getLastCellNum(); col++) {
				String header = headerRow.getCell(col).getStringCellValue().trim();
				ArrayList<String> dataList = null;
				try {
					if (!header.isEmpty() || header != null || header != "") {
						int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
						dataList = new ArrayList<String>();
						for (int i = 1; i < rowCount + 1; i++) {
							Row DataRow = sheet.getRow(i);
							try {
								String data = DataRow.getCell(col).getStringCellValue().trim();
								if (!data.isEmpty() || data != null) {
									if (data != "") {
										dataList.add(data);
									} else {
										break;
									}
								} else {
									break;
								}
							} catch (Exception e) {
								break;
							}
						}
					}
				} catch (Exception e) {
					break;
				}
				if (dataList.size() != 0 && header != "") {
					testData.put(header, dataList);
				}
			}
			return testData;
		} catch (Exception e) {
			workbook.close();
		} finally {
			workbook.close();
		}
		return testData;
	}

	public static HashMap<String, String> readExcelData(String SheetName, String Key) throws IOException {
		HashMap<String, String> dataSheetDetails = null;
		try {
			String excelFilePath = "./src/test/resources/Data/C4C_TestData.xlsx";
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet dataSheet = workbook.getSheet(SheetName);
			for (int row = 1; row <= dataSheet.getLastRowNum(); row++) {
				if (dataSheet.getRow(row).getCell(0).getStringCellValue().equalsIgnoreCase(Key)) {
					dataSheetDetails = new HashMap<String, String>();
					for (int col = 1; col < dataSheet.getRow(row).getLastCellNum(); col++) {
						String fieldName = null;
						String fieldValue = null;
						try {
							fieldName = dataSheet.getRow(0).getCell(col).getStringCellValue();
							fieldValue = dataSheet.getRow(row).getCell(col).getStringCellValue();
							if (!fieldValue.isEmpty()) {
								dataSheetDetails.put(fieldName, fieldValue);
							}
						} catch (Exception e) {
							dataSheetDetails.put(fieldName, fieldValue);
						}
					}
					break;
				}
			}
			workbook.close();
			return dataSheetDetails;
		} catch (Exception e) {
			e.printStackTrace();
			return dataSheetDetails;
		}
	}

	public static HashMap<String, String> readExcelData(String SheetName, int row) throws IOException {
		HashMap<String, String> dataSheetDetails = null;
		try {
			String excelFilePath = "./src/test/resources/Data/C4C_TestData.xlsx";
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet dataSheet = workbook.getSheet(SheetName);
			dataSheetDetails = new HashMap<String, String>();
			for (int col = 0; col < dataSheet.getRow(row).getLastCellNum(); col++) {
				String fieldName = null;
				String fieldValue = null;
				try {
					fieldName = dataSheet.getRow(0).getCell(col).getStringCellValue();
					fieldValue = dataSheet.getRow(row).getCell(col).getStringCellValue();
					if (!fieldValue.isEmpty()) {
						dataSheetDetails.put(fieldName, fieldValue);
					}
				} catch (Exception e) {
					dataSheetDetails.put(fieldName, fieldValue);
				}
			}
			workbook.close();
			return dataSheetDetails;
		} catch (Exception e) {
			e.printStackTrace();
			return dataSheetDetails;
		}
	}

}
