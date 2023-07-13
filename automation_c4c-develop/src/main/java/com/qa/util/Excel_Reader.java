package com.qa.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Excel_Reader {

	// private static final String FileTestData_Path =
	// "src\\test\\resources\\TestData\\TestData.xlsx";

	public static String getRandom_Values(String sheetName, String fieldName) {

		try {
			// Demo Class
			String PAGE_LOAD_DATA = ConfigReader.getApplicationProperties().getProperty("C4C_Data");
			Random rand = new Random();

			ExcelReader ex = new ExcelReader();
			List<Map<String, String>> lst = ex.getData(sheetName);
			List<String> lstr = new LinkedList<String>();

			for (Map<String, String> mp : lst) {
				lstr.add(mp.get(fieldName));
			}

			Iterator<String> st = lstr.iterator();
			while (st.hasNext()) {
				String sg = st.next();
				if (sg.equals("")) {
					st.remove();
				}
			}
			int upperbound = lstr.size();
			int int_random = rand.nextInt(upperbound);
			return lstr.get(int_random);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;

		}
	}

	public static void clickOn_AddRow(int rows) {
		int j = 1;
		for (int i = 1; i <= rows; i++) {
			System.out.println(j);

			j += 2;
		}
	}

	public static List<String> getListOf_values(String sheetname, String columnName) {
		ExcelReader excRead = new ExcelReader();
		String filePath = ConfigReader.getApplicationProperties().getProperty("C4C_Data");
		List<String> lst = excRead.getListOfValuesFromColumn(sheetname, columnName, filePath);
		return lst;

	}

}