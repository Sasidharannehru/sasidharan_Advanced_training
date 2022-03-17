package com.sasi.FourthProblemSession;

import java.util.Scanner;

public class BankAccount {
	int Accno;
	String CustName;
	String AccType;
	float Balance;
	
	 BankAccount(String Cname,int accno) {
		 CustName=Cname;
		 Accno= accno;
		 
		
	}
	
	
	
	public void Deposit(float amt) {
		
		if(amt!=0) {
			Balance=Balance+amt;
		}
		
		
		
	}
	public void Withdraw(float amt) {
		if(amt!=0) {
			Balance=Balance-amt;
		}
		
	}
	public float GetBalace() {
		return Balance;
		
	}
	void showMenu() {
		int choice=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome "+CustName);
		System.out.println("your account number is :"+Accno);
		System.out.println("\n");
		System.out.println("1.check balance");
		System.out.println("2.deposit");
		System.out.println("3.widraw");
		System.out.println("4.exit");
		
		do {
			System.out.println("enter the option :"+CustName);
			choice=sc.nextInt();
			System.out.println("\n");
			
			switch(choice) {
			
			
			case 1:
				System.out.println("balance is :"+Balance);
				System.out.println("\n");
				break;
			case 2:
				System.out.println("Enter the amount to deposit");
				float amt=sc.nextFloat();
				Deposit(amt);
				System.out.println("\n");
				break;
			case 3:
				System.out.println("Enter the amount to widraw");
				float amt1=sc.nextFloat();
				Withdraw(amt1);
				System.out.println("\n");
				break;
			case 4:
				System.out.println("******");
				break;
			default:
				System.out.println("you enter the wrong choice, please enter the valid option");
			}
			
		}while(choice !=4);
		System.out.println("than you  "+ CustName);
		

		
	}

}
