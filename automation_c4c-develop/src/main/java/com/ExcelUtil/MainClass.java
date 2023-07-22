package com.ExcelUtil;

import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		Excel_Read_Write exc=new Excel_Read_Write();
		Map<String, Map<String, String>>  mpp=exc.initData("TRAIN");
		System.out.println(mpp.get("Counsellor").get("JJJJJ"));
		
	}

}
