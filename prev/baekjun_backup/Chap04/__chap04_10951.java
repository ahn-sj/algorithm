package Baekjoon.Chap04;

import java.util.Scanner;

public class __chap04_10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		while (cnt < 5) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);
			cnt++;
		}
		sc.close();
	}

}
