package com.sasi.secondSession;

import java.util.Scanner;

public class SumOf13Number {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two Number: ");
		
		int NumberOne=sc.nextInt();
		int NumberTwo=sc.nextInt();
		int n=NumberOne+NumberTwo;
		 
		
		for(int i=1;i<=15;++i) {
			
			System.out.print(NumberOne+" ");
		
			int NextNumber=NumberOne+NumberTwo;
			NumberOne=NumberTwo;
			NumberTwo=NextNumber;
			
}
	
}	
	
}


