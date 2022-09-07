package Baekjoon.Chap07;

import java.util.Scanner;

public class chap07_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.indexOf(97 + i);
			System.out.print(arr[i] + " ");
		}
	}

}
