package HotelManagement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhone{
	 Boolean Check(String phone){
		  //VEDANG208 --->>>>>>>>>>>>>>>>>>>
			//Regular expression to accept valid phone number
		      String regex = "\\d{10}";
		      //Creating a pattern object
		      Pattern pattern = Pattern.compile(regex);
		      //Creating a Matcher object
		      Matcher matcher = pattern.matcher(phone);
		      if(matcher.matches()) {
		          return true;
		       } 
		      else { 
		        return false;
		       }
			 
			 
		 }
	
		
	}