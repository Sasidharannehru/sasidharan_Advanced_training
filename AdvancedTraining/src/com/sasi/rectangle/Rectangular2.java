package com.sasi.rectangle;

public class Rectangular2 {
	float lenth=1;
	float width=1;
	float breath=2;

	public static void main(String[] args) {
		new Rectangular2().area();
		new Rectangular2().perimeter();
		
	}
	
	
	public void area() {
		
		float area=lenth*breath;
		System.out.println("area of rectangular  "+area);
		
		
		
	}
	public void perimeter() {
		
		
		float perimeter= 2*(lenth+width);
		System.out.println("the perimeter is :  "+perimeter);
	}



	public float getLenth() {
		return lenth;
	}


	public void setLenth(float lenth) {
		this.lenth = lenth;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}

}
