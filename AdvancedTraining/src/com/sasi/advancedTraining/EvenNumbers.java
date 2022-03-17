package com.sasi.advancedTraining;

import java.util.Scanner;

public class EvenNumbers {
	int UserInput;
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user input");
		
         int UserInput=sc.nextInt();
         
         for(int i=0;i<=UserInput;i++) {
        	 if(i%2==0&i<=UserInput) {
        		 
        		 System.out.print(" "+i+" ");
        	 }
         }
         
		
	}

}
