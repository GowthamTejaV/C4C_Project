package com.qa.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Properties;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class ListeningUtils {
	//static RequestSpecification listeningtestReqSpec;
	static String path = System.getProperty("user.dir");
	private static String PropertyFileName = path + "\\src\\test\\resources\\global.properties";
	private static String ResourcePath = path + "/src/test/resources/payloads/";
	private static File Payload;

//	public RequestSpecification listeningTestRequestSpecification() throws IOException {
//		System.out.println("Inside Importmarks request spec------");
//		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
//		if (listeningtestReqSpec == null) {
//			listeningtestReqSpec = new RequestSpecBuilder().setBaseUri(getGlobalValue("ImportMarksBaseUrl"))
//					.addHeader("Content-Type", "application/json")
//					.addHeader("x-api-key", "ch8TWj8dqosIHSrBkCwB8vQJbRNfXpU7cvBsDvS8")
//					.addFilter(RequestLoggingFilter.logRequestTo(log)).setContentType(ContentType.JSON).build();
//			// return listeningtestReqSpec;
//		}
//		return listeningtestReqSpec;
//
//	}

	public static String getGlobalValue(String baseUrlKey) throws IOException {
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\JebarajIsaac.j\\eclipse-workspace\\Mkpt_BDD\\src\\test\\java\\resources\\global.properties");
		property.load(fis);
		return (String) property.get(baseUrlKey);

	}

	public static Object readListeningJsonFile(String filename) throws IOException, ParseException {
		// JSONObject body = new JSONObject();
		String fullpath = (new StringBuilder()).append(path).append("\\src\\test\\resources\\payloads\\")

				.append(filename).toString();		
		File file = new File(fullpath);
		FileReader reader = new FileReader(file);
		JSONParser jsonParser = new JSONParser();
		System.out.println("Json object value is "+jsonParser.parse(reader));
		return jsonParser.parse(reader);
	}
	
	public static String readListeningJsonString(String filename) throws IOException, ParseException {
		String fullpath = (new StringBuilder()).append(path).append("\\src\\test\\resources\\payloads\\")
				.append(filename).toString();
		//Path filePath = Path.of(fullpath);
		//String content = Files.readString(filePath);
		//return content;
		Path filePath = Paths.get(fullpath);
		String content = new String(Files.readAllBytes(filePath));
		return content;
	}

	/*
	 * public static Object updateListeningJsonFile(JSONObject json, String
	 * Testcasename) throws Exception {
	 * 
	 * //String host = null; //String message = (String) json.get("message");
	 * //JSONObject jsonObject = (JSONObject) json.get("marks");
	 * 
	 * //JSONArray jsonArray = (JSONArray) JSONValue.parse(json.toJSONString());
	 * //Iterator<?> jsonArrayIterator = jsonArray.iterator();
	 * //while(jsonArrayIterator.hasNext()) { // jsonObject = (JSONObject)
	 * jsonArrayIterator.next(); //host = (String) jsonObject.remove("markType");
	 * 
	 * //} //System.out.println("The value for json is "+jsonObject);
	 * //json.remove("processingInstructions");
	 * //System.out.println(json.toString());
	 * 
	 * JSONArray jsonArray = new JSONArray(); //JSONArray jsonArray = (JSONArray)
	 * json.get("processingInstructions");
	 * jsonArray.add(json.get("processingInstructions")); //.put(json); JSONObject
	 * json2 = (JSONObject) json.get("processingInstructions"); Iterator x =
	 * jsonArray.iterator(); System.out.println("Iterator value is "+x);
	 * System.out.println("Array size is "+jsonArray.size()); for(int
	 * i=0;i<jsonArray.size();i++) { //String key=(String)x.next(); //jsonArray.
	 * remove("NORMAL"); //Boolean ifmarktypeavailable =
	 * jsonArray.contains("NORMAL");
	 * //System.out.println("Marktype value is available"+ifmarktypeavailable);
	 * //JSONObject item = jsonArray. String json1 = (String)jsonArray.toString();
	 * //String name = (String) jsonArray.get("markType");
	 * System.out.println("Array value is "+json1);
	 * //System.out.println("Marktype value is "+name); }
	 * 
	 * while(x.hasNext()) { }
	 * 
	 * for (Object key : json2.keySet()) { String keyStr = (String) key; Object
	 * keyvalue = json2.get(keyStr); Boolean json3 = json2.remove("markType",
	 * "NORMAL"); System.out.println("Final json is "+json2); if (!(keyvalue
	 * instanceof JSONObject)) { System.out.println("Key value pairs are ");
	 * System.out.println(keyStr + ", " + keyvalue);
	 * 
	 * 
	 * } if (keyvalue instanceof JSONObject) { printJsonObject((JSONObject)
	 * keyvalue); } }
	 * 
	 * return json2; }
	 */

	public static String gettestdatavalue() throws Exception {
		String filename = "InsperaDatafile.csv";
		String fullpath = (new StringBuilder()).append(path).append("\\src\\test\\java\\resources\\csvdata\\")
				.append(filename).toString();
		{

			Reader reader = Files.newBufferedReader(Paths.get(fullpath));
			@SuppressWarnings({ "deprecation", "resource" })
			CSVParser csvParser = new CSVParser(reader,
					CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

			List<CSVRecord> csvRecords = csvParser.getRecords();
			System.out.println("csvRecords : " + csvRecords.toString());

			{
				for (CSVRecord csvRecord : csvRecords) {
					String Testcasename = csvRecord.get(0).toString();
					String MarkType = csvRecord.get(1).toString();
					String ExternalUserId = csvRecord.get(2).toString();
					String Mark1 = csvRecord.get(3).toString();

					System.out.println("---------------");
					System.out.println("Testcasename : " + Testcasename);
					System.out.println("MarkType : " + MarkType);
					System.out.println("ExternalUserId : " + ExternalUserId);
					System.out.println("Mark1 : " + Mark1);
					System.out.println("---------------\n\n");

					String[] values = new String[csvRecord.size()];
					for (int i = 0; i < csvRecord.size(); i++) {
						values[i] = csvRecord.get(i);

					}
					List<String[]> records = new ArrayList<String[]>();
					records.add(values);
					/* System.out.println("values : "+ records.toString()); */
				}
			}

		}
		return "new";
	}

	public static void GoToEmbededFrame() {
		try {
			DriverFactory.driver.switchTo().frame("embeddedTool");
			ExtentCucumberAdapter.addTestStepLog("Move to embedded frame is successfull");
		} catch (Exception e) {
			Assert.assertFalse("Failed to move to embedded frame", true);
		}
	}

	public static void GoOutOfEmbededFrame() {
		try {
			DriverFactory.driver.switchTo().defaultContent();
			ExtentCucumberAdapter.addTestStepLog("Move out of embedded frame is successfull");
		} catch (Exception e) {
			Assert.assertFalse("Failed to move out of embedded frame", true);
		}
	}

	public static String GetProperty(String PropertyName) throws IOException, InterruptedException {
		try {
			FileReader reader = new FileReader(PropertyFileName);
			Properties prop = new Properties();
			prop.load(reader);
			String propertyvalue = prop.getProperty(PropertyName);
			return propertyvalue;
		} catch (Exception e) {
			Assert.assertFalse("Failed to load property or get property from property file", true);
			//Thread.sleep(2000);
			ExtentCucumberAdapter.addTestStepLog("Property load error is " + e); 
			return null;
		}
	}

	public static Integer GetIntProperty(String PropertyName) throws IOException {
		try {
			FileReader reader = new FileReader(PropertyFileName);
			Properties prop = new Properties();
			prop.load(reader);
			String propertyvalue = prop.getProperty(PropertyName);
			Integer value = Integer.parseInt(propertyvalue);
			return value;
		} catch (Exception e) {
			Assert.assertFalse("Failed to load integer property or get property from property file", true);
			ExtentCucumberAdapter.addTestStepLog("Property load error is " + e);
			return null;
		}
	}

	public static String Base64CredentialDecode(String EncodedCredential) {
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(EncodedCredential);
			String DecodedString = new String(decodedBytes);
			return DecodedString;
		} catch (Exception e) {
			Assert.assertFalse("Failed to decode the credential", true);
			return null;
		}
	}

	public static String Base64CredentialEncode(String Credential) {
		try {
			byte[] encodedBytes = Base64.getEncoder().encode(Credential.getBytes());
			String EncodedString = new String(encodedBytes);
			return EncodedString;
		} catch (Exception e) {
			Assert.assertFalse("Failed to encode the credential", true);
			return null;
		}
	}

//	public static <MarkReq> String ImportMksPostOperation(String ChildTest, String Authorization, String Authcode,
//			MarkReq ScoreImportReqBody, String BaseURI, String BasePath) throws Exception {
//		io.restassured.response.Response res = io.restassured.RestAssured.given().log().all().baseUri(BaseURI)
//				.header("Authorization", Authorization)
//				.header("Cookie",
//						"AWSALB=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; AWSALBCORS=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; Cookie_1=value; JSESSIONID=9F6546F9FC02D8737992B1B319996E248C6B3375B4F2A9431D837B761E51; serverId=app220")
//				.header("User-Agent", "PostmanRuntime/7.28.4").header("Accept", "*/*")
//				.header("Accept-Encoding", "gzip, deflate, br").header("Connection", "keep-alive")
//				.header("Content-Type", "application/json").auth().oauth2(Authcode).body(ScoreImportReqBody).when()
//				.post(BasePath).then().extract().response();
//		String responseString = res.getBody().asPrettyString();
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API response code is " + Integer.toString(res.statusCode()));
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API response is " + responseString);
//		Assert.assertEquals(200, res.statusCode());
//		return responseString;
//	}
//
//	public static <MarkReq> io.restassured.response.Response ImportMksErrorPostOp(String ChildTest, String Authorization, String Authcode,
//			MarkReq ScoreImportReqBody, String BaseURI, String BasePath) throws Exception {
//		io.restassured.response.Response res = io.restassured.RestAssured.given().log().all().baseUri(BaseURI)
//				.header("Authorization", Authorization)
//				.header("Cookie",
//						"AWSALB=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; AWSALBCORS=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; Cookie_1=value; JSESSIONID=9F6546F9FC02D8737992B1B319996E248C6B3375B4F2A9431D837B761E51; serverId=app220")
//				.header("User-Agent", "PostmanRuntime/7.28.4").header("Accept", "*/*")
//				.header("Accept-Encoding", "gzip, deflate, br").header("Connection", "keep-alive")
//				.header("Content-Type", "application/json").auth().oauth2(Authcode).body(ScoreImportReqBody).when()
//				.post(BasePath).then().extract().response();
//		String responseString = res.getBody().asPrettyString();
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API response code is " + Integer.toString(res.statusCode()));
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API response is " + responseString);
//		//res.body().jsonPath().get("messages").toString();
//		///Assert.assertEquals(200, res.statusCode());
//		return res;
//	}
//	
//	public static String ImptMksPayloadPostOperation(String ChildTest, String Authorization, String Authcode,
//			String PayloadFileName, String BaseURI, String BasePath) throws Exception {
//		Payload = new File(ResourcePath + PayloadFileName);
//		io.restassured.response.Response res = io.restassured.RestAssured.given().log().all().baseUri(BaseURI)
//				.header("Authorization", Authorization)
//				.header("Cookie",
//						"AWSALB=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; AWSALBCORS=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; Cookie_1=value; JSESSIONID=9F6546F9FC02D8737992B1B319996E248C6B3375B4F2A9431D837B761E51; serverId=app220")
//				.header("User-Agent", "PostmanRuntime/7.28.4").header("Accept", "*/*")
//				.header("Accept-Encoding", "gzip, deflate, br").header("Connection", "keep-alive")
//				.header("Content-Type", "application/json").auth().oauth2(Authcode).body(Payload).when().post(BasePath)
//				.then().extract().response();
//		String responseString = res.getBody().asPrettyString();
//		ExtentCucumberAdapter
//				.addTestStepLog(ChildTest + " test API response code is " + Integer.toString(res.statusCode()));
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API response is " + responseString);
//		Assert.assertEquals(200, res.statusCode());
//		return responseString;
//	}
//
//	public static String ImptMksErrorPayloadPostOperation(String ChildTest, String Authorization, String Authcode,
//			String PayloadFileName, String BaseURI, String BasePath) throws Exception {
//		Payload = new File(ResourcePath + PayloadFileName);
//		io.restassured.response.Response res = io.restassured.RestAssured.given().log().all().baseUri(BaseURI)
//				.header("Authorization", Authorization)
//				.header("Cookie",
//						"AWSALB=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; AWSALBCORS=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; Cookie_1=value; JSESSIONID=9F6546F9FC02D8737992B1B319996E248C6B3375B4F2A9431D837B761E51; serverId=app220")
//				.header("User-Agent", "PostmanRuntime/7.28.4").header("Accept", "*/*")
//				.header("Accept-Encoding", "gzip, deflate, br").header("Connection", "keep-alive")
//				.header("Content-Type", "application/json").auth().oauth2(Authcode).body(Payload).when().post(BasePath)
//				.then().extract().response();
//		String responseString = res.getBody().asPrettyString();  
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API request is: " + ListeningUtils.readListeningJsonString(PayloadFileName));
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API response code is: " + Integer.toString(res.statusCode()));
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API response is: " + responseString);
//		Assert.assertEquals(400, res.statusCode());
//		return responseString;
//	}
//	
//	public static <MarkReq> io.restassured.response.Response ImptMksErrorPayloadPostOp(String ChildTest, String Authorization, String Authcode,
//			String PayloadFileName, String BaseURI, String BasePath) throws Exception {
//		Payload = new File(ResourcePath + PayloadFileName);
//		String pl = ListeningUtils.readListeningJsonString(PayloadFileName);
//		//System.out.println("Updated payload is: "+pl);
//		io.restassured.response.Response res = io.restassured.RestAssured.given().log().all().baseUri(BaseURI)
//				.header("Authorization", Authorization)
//				.header("Cookie",
//						"AWSALB=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; AWSALBCORS=o4+axI6Tz6FibezHB6YaSaAfd9a5CF/bWxhHamADTr81+M8vpkvCqw1nmCzhOwGuhqtwGKNou3NebvHNYBtb+cCTWI/sa1083bikBnelMp5vYw6ZkMRSYi9Bd9Mh; Cookie_1=value; JSESSIONID=9F6546F9FC02D8737992B1B319996E248C6B3375B4F2A9431D837B761E51; serverId=app220")
//				.header("User-Agent", "PostmanRuntime/7.28.4").header("Accept", "*/*")
//				.header("Accept-Encoding", "gzip, deflate, br").header("Connection", "keep-alive")
//				.header("Content-Type", "application/json").auth().oauth2(Authcode).body(pl).when().post(BasePath)
//				.then().extract().response();
//		String responseString = res.getBody().asPrettyString();  
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API request is: " + ListeningUtils.readListeningJsonString(PayloadFileName));
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API response code is: " + Integer.toString(res.statusCode()));
//		ExtentCucumberAdapter.addTestStepLog(ChildTest + " test API response is: " + responseString);
//		Assert.assertEquals(400, res.statusCode());
//		return res;
//	}
//	
//	
//	
//	public static void ErrorValidation(long ActualErrorCode, long ExpectedErrorCode, String[] ActualErrorDescription, String ExpectedErrorDescription)
//	{
//		String actualMessage = null;
//	    Boolean Validate = null;
//		try
//    	 {
//    	 Assert.assertEquals(ExpectedErrorCode, ActualErrorCode);
//    	 ExtentCucumberAdapter.addTestStepLog("Error response code is as expected: " + ActualErrorCode);
//    	 System.out.println("Error String to compare: "+ExpectedErrorDescription);
//    	 for (int i = 0; i < ActualErrorDescription.length; i++)
//    	 {
//    		 System.out.println("Error array to compare: "+ActualErrorDescription[i]);
//    		 if(ActualErrorDescription[i].matches(ExpectedErrorDescription))
//    		 {
//    			 Validate = (ActualErrorDescription[i].matches(ExpectedErrorDescription));
//    			 actualMessage =  ActualErrorDescription[i];
//        		 ExtentCucumberAdapter.addTestStepLog("Error response description is as expected: " + actualMessage); 
//    		 }
//    	 }
//    	 Assert.assertTrue(Validate);
//    	 }
//    	 catch (AssertionError e)
//    	 {
//    	 ExtentCucumberAdapter.addTestStepLog("Error response code is not as expected: " + ActualErrorCode); 
//    	 ExtentCucumberAdapter.addTestStepLog("Error response description is not as expected: " + actualMessage);
//    	 ExtentCucumberAdapter.addTestStepLog("Assertion Error is: " + e);
//    	 }
//	}
//	
//	public static String GetErrorDescription(Response ErrorResponse, String ResponseAttribute)
//	{
//		String ActualMessage = ErrorResponse.body().jsonPath().get(ResponseAttribute).toString();
//		return ActualMessage;
//	}
//	
//	public static long GetErrorCode(Response ErrorResponse)
//	{
//		long ErrorCode = ErrorResponse.statusCode();
//		return ErrorCode;
//	}
//	
//	public static String[] SplitResponse(String ActualMessage)
//	{
//		ActualMessage = ActualMessage.replace("[", "");
//		ActualMessage = ActualMessage.replace("]", "");
//		String[] result = ActualMessage.split(", ");
//		/*
//		 * for (String str : result) {
//		 * System.out.println("SplitResponse output array is: "+str); }
//		 */
//		return result;
//	}

}
