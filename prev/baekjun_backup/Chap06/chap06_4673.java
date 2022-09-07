package Baekjoon.Chap06;

import java.util.Arrays;

public class chap06_4673 {

	public static void main(String[] args) {
		int[] arr = new int[10500];

		for (int i = 0; i < 10500; i++) {
			if(i < 100) {
			if (arr[i + i / 10 + i % 10] > 0)
				System.out.println(arr[i + i / 10 + i % 10]);
			}
		}

	}

}
