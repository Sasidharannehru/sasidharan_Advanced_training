package com.sasi.books;

import java.util.Arrays;

public class Books {
	String [] book_title;
 double[] price;

	
	
	public String[] getBook_title() {
	return book_title;
}

public void setBook_title(String[] book_title) {
	this.book_title = book_title;
}

public double[] getPrice() {
	return price;
}

public void setPrice(double[] price) {
	this.price = price;
}

	public static void main(String[] args) {
		
	new Books().createbook();
		
	}
	
	public void createbook() {
			String[] tittle= {"javaProgram","c"};
		 double[] price= {350.50,200.00};
		 
		 System.out.println(tittle[0]+" "+price[0]);
		 System.out.println(tittle[1]+" "+price[1]);
		 
		
		
		 
		
		
	
}
	@Override
	public String toString() {
		return "Books [book_title=" + Arrays.toString(book_title) + ", price=" + Arrays.toString(price) + "]";
	}

	public void showBook() {
		
	}
}

