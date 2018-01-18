package com.assignmentsfunjava;

public class StringManipulator {
	public String trimAndConcat(String str1, String str2) {
	return str1.trim()+str2.trim();
	}
	
	public Integer getIndexOrNull(String str , char ch) {
		if(str.indexOf(ch)> 0) {
			int num1 = str.indexOf(ch);
			return num1;
	   }else {
		   return null;
	   }
	}
	public Integer getIndexOrNull(String str2,String str3) {
		if(str2.indexOf(str3)>0) {
			int num1 = str2.indexOf(str3);
			return num1;	
		}else {
			return null;
		}		
	}
	
	public String concatSubstring(String str4,int num4, int num5, String str5 ) {
		String start = str4.substring(num4, num5);
		String end =start.concat(str5);
		return end;
	}

}