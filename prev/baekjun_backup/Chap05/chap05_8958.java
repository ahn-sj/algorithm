package Baekjoon.Chap05;

import java.util.Scanner;

public class chap05_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < max; i++) {
			String str = sc.nextLine();
			
			int sum = 0;
			int cnt = 0;
			
			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(j) == 'O') cnt++;
				else if (str.charAt(j) == 'X') cnt = 0;
				sum += cnt;
			}
			System.out.println(sum);
		}

	}

}
