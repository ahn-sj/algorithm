package Baekjoon.Chap05;

import java.util.Scanner;

public class chap05_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int cnt = 0;

		int[] arr_42 = new int[42];

		for (int i = 0; i < 10; i++) {
			arr_42[sc.nextInt() % 42]++;
		}

		for (int i = 0; i < arr_42.length; i++) {
			if (arr_42[i] != 0)
				cnt++;
		}
		System.out.println(cnt);
	}

}
