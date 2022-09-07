package Baekjoon.Chap05;

import java.util.Scanner;

public class chap05_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr_cnt = new int[10];

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int int_multi = a * b * c;

		String str_multi = Integer.toString(int_multi);

		for (int i = 0; i < str_multi.length(); i++) {
			for (int j = 0; j < 10; j++) {
				if (str_multi.charAt(i) == 48 + j) {
					arr_cnt[j]++;
				}
			}
		}

		for (int i = 0; i < arr_cnt.length; i++)
			System.out.println(arr_cnt[i]);
	}

}
