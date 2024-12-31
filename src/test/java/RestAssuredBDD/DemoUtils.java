package RestAssuredBDD;

import org.apache.commons.lang3.RandomStringUtils;

public class DemoUtils {
	
	public static String getfname(){
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Mohan"+generatedString);
	}
	public static String getlname(){
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("raj"+generatedString);
	}
	public static String getusername(){
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Mohan"+generatedString);
	}
	public static String getpassword(){
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Mohan"+generatedString);
	}
	public static String getemail(){
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return (generatedString+ "gmail.com");
	}
	public static String empname(){
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Mohan"+generatedString);
	}
	public static String empsal(){
		String generatedString = RandomStringUtils.randomNumeric(5);
		return (generatedString);
	}
	public static String empage(){
		String generatedString = RandomStringUtils.randomNumeric(2);
		return (generatedString);
	}

}
