package Baekjoon.Chap05;

import java.util.Scanner;

public class chap05_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] > max) {
				max = arr[i];
				cnt = i + 1;
			}
		}
		System.out.println(max + "\n" + cnt);
	}

}
