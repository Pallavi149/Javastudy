package com.practice;

public class PrimeNumberSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 15;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("number is not prime");
				break;
			}

			else {
				System.out.println("Number is prime");
			}

		}
	}
}
