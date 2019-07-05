package com.java;

public class EvenOddIndexArrayElement {
	public static void main(String[] args) {
		//initialize array
		int[] arr = new int[] {1,  2, 3, 4, 5, } ;
		/*System.out.println("element of given array present on even position:");
		loop through the array by incrementing value of i by 2
		here , i will start from 1 as first even position element is present
		position 1.*/
		
		for (int i=1; i<arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
System.out.println("Elements of given array present on odd position:");
// loop through the array by increment value of i by2
for (int i=0; i< arr.length; i=i+2){
	System.out.println(arr[i]);
}
}
}
