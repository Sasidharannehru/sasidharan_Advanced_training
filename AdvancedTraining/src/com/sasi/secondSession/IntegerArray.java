package com.sasi.secondSession;

public class IntegerArray {

	public static void main(String[] args) {
	 	int a[]= {3,2,4,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		System.out.println();
    int sum = 0;

    int n=a.length;
     n=14;
  

   for(int i=0;i<n;i++) {
	sum=sum+a[i];
	
	
    }
   System.out.println("the sum of the element "+sum);


     System.out.println("the element in the original array  :"+a[15]);
       a[15]=sum;
    System.out.println("the updated array element i array at postion of 15 th element ::"+a[15]);
     

		 float average=sum/a.length;
		 System.out.println("the average of the elemnts is : "+average);
		 
		 a[16]=(int) average;
		 System.out.println("the updated 16 th elemnt is : "+a[16]);
		 
		 
		 int min=a[0];
		 for( int i=0;i<a.length;i++) {
			 if(a[i]<min) {
				 min=a[i];
				
			 }
			 
		 } System.out.println("smallest number of given array  :"+min);
		 
	
}
	
}
