package Baekjoon.Chap03;

import java.util.Scanner;

public class chap03_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(max + " * " + i + " = " + max * i);
		}
	}

}
