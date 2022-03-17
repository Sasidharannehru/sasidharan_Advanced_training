package com.sasi.fifthSession;

//public class StringAssignment {
//	
//
//	public static void main(String[] args) {
//		
//		String str="JAVA is Simple";
//		String UpperCase=str.toUpperCase();
//		System.out.println("the updated string is :"+UpperCase);
//		String LowerCase=str.toLowerCase();
//		System.out.println("the updated lowercase String is :" +LowerCase);
//		
//		
//
//	}
//
//}

public class StringManipulations {

	public static void main(String[] args) {
		String s="JAVA is SIMPLE";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String[] splitted=s.split(" ", 0);
		 for (int i = 0; i < splitted.length; i++) {
		        String str = splitted[i];
		        System.out.print(str.charAt(0));
		    }
		 for (int i = splitted.length-1; i >=0 ; i--) {
		        String str = splitted[i];
		        System.out.println("");
		        System.out.print(str+" ");
		       
		    }
		 System.out.println("");
		 for (int i = 0; i < splitted.length; i++) {
		        StringBuilder str = new StringBuilder(splitted[i]);
		        System.out.print(str.reverse()+" ");
		    }
		 System.out.println("");
		 System.out.println("the length of string is "+s.length());
		 
	}

}
