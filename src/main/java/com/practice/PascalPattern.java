package com.practice;

public class PascalPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int columns = 15;
		int rows = columns * 2 - 1;
		int k = 1;
		for (int y = 1; y <= rows; y++) {
			for (int x = 1; x <= k; x++) {
				System.out.print("*");
			}

			if (y <columns) {
				k++;
			} else {
				k--;
			}
			System.out.println();
		}
	}

}
