package Baekjoon.Chap03;

import java.util.Scanner;

public class chap03_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		int max = sc.nextInt();
		int[] arr = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] < max)
				System.out.print(arr[i] + " ");
		}
	}

}
