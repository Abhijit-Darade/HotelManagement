package HotelManagement;



import java.util.regex.*;
class ValidAadhar {

	
	public static boolean
	isValidAadharNumber(String str)
	{
		
		String regex
			= "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";

		
		Pattern p = Pattern.compile(regex);

		
		if (str == null) {
			return false;
		}

		
		Matcher m = p.matcher(str);

		return m.matches();
	}
}

