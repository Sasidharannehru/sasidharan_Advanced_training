package com.sasi.rectangle;

import java.util.Scanner;

public class TestRectangle {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestRectangle().rect1(0, 0);
		new TestRectangle().rect2(0, 0);
		new TestRectangle().rect3(0, 0);
		new TestRectangle().rect4(0, 0);
		new TestRectangle().rect5(0, 0);

	}
	
	void rect1(int lenth, int breath) {
		
		System.out.println("enter the lenth:");
		lenth =sc.nextInt();
		System.out.println("enter the breath :");
		breath=sc.nextInt();
		System.out.println("the area of rectangular1 is "+(lenth*breath));
		
		
	}
	void rect2(int lenth,int breath) {
		System.out.println("enter the lenth:");
		lenth =sc.nextInt();
		System.out.println("enter the breath :");
		breath=sc.nextInt();
		System.out.println("the area of rectangular2 is "+(lenth*breath));
		
		
	}
	void rect3(int lenth,int breath) {
		System.out.println("enter the lenth:");
		lenth =sc.nextInt();
		System.out.println("enter the breath :");
		breath=sc.nextInt();
		System.out.println("the area of rectangular3 is "+(lenth*breath));
		
		
	}
	void rect4(int lenth,int breath) {
		System.out.println("enter the lenth:");
		lenth =sc.nextInt();
		System.out.println("enter the breath :");
		breath=sc.nextInt();
		System.out.println("the area of rectangular4 is "+(lenth*breath));
		
		
	}
	void rect5(int lenth,int breath) {
		System.out.println("enter the lenth:");
		lenth =sc.nextInt();
		System.out.println("enter the breath :");
		breath=sc.nextInt();
		System.out.println("the area of rectangular5 is "+(lenth*breath));
		
		
	}

}
