package com.java;

public class AverageOfArray {
	public static void main(String[] args) {
		Double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6, };
		double sum = 0.0;
		for (double num : numArray) {
			sum += num;

		}
		double average = sum / numArray.length;
		System.out.format("the average is : %.2f", average);
	}
}