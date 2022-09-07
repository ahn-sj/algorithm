package Baekjoon.Chap05;

import java.util.Arrays;
import java.util.Scanner;

public class chap05_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int[] arr = new int[a];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[arr.length-1]);
/*
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println(min + " " + max);
*/
	}

}
