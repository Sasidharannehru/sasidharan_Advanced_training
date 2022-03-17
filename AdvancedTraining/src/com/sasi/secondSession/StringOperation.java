package com.sasi.secondSession;

public class StringOperation {
	public static void main(String[] args) {
	 boolean flag=true;
		
		String str="sasi";
		str.toUpperCase();
		System.out.println("the upper case string is  "+ str);
		 int lenth=str.length();
		System.out.println("the lenth of the charecter  "+lenth);
		
		
		str.toLowerCase();
		
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				flag=false;
				break;
				
			}
		}
		
	
	if(flag) 
		System.out.println("the given string is palindrom");
		else
			System.out.println("the given string is not a polindrom");
	

}
}
