package Baekjoon.Chap02;

import java.util.Scanner;

public class chap02_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a < 24 && a > 0) {
			if (b >= 45)
				System.out.println(a + " " + (b - 45));
			else
				System.out.println(a - 1 + " " + (60 + b - 45));
		} else if (a == 0) {
			if (b >= 45)
				System.out.println(a + " " + (b - 45));
			else
				System.out.println(23 + " " + (60 + b - 45));
		}
	}

}
