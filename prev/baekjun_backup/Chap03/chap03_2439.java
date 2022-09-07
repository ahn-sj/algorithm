package Baekjoon.Chap03;

import java.util.Scanner;

public class chap03_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt();

		for (int i = 0; i < max; i++) {
			for (int j = max-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
