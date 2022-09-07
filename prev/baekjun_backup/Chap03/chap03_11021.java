package Baekjoon.Chap03;

import java.util.Scanner;

public class chap03_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt();

		for (int i = 1; i <= max; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + (a + b));
		}
	}

}
