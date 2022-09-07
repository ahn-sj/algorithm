package Baekjoon.Chap03;

import java.util.Scanner;

public class chap03_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
