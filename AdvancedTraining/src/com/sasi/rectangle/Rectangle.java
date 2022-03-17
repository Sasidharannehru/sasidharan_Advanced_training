package com.sasi.rectangle;

import java.util.Scanner;

public class Rectangle {
static	int length;
static	int breath;
Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
	   new Rectangle().AreaOfRectangle();
		
		
		
		

	}
	void AreaOfRectangle() {
System.out.println("enter the lenth of the  rectangular");
		 length=sc.nextInt();
		 
		 System.out.println("enter the breath of the recctangular");
		 breath=sc.nextInt();
		 int Area=length*breath;
		 System.out.println("the area of thr rectangle is :"+Area);
		 System.out.println("the lenth of the rectangle is:"+length);
		 System.out.println("the breath of thre rectangle is:"+breath);
		
		
		
	}

}
