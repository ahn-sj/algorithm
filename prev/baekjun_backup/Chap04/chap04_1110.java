package Baekjoon.Chap04;

import java.util.Scanner;

public class chap04_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt();
		int cnt = 0;
		int compare = max;
		
		while (true) {
			max = (((max % 10) * 10) + ((max / 10) + (max % 10)) % 10);
			cnt++;

			if (max == compare)
				break;
		}
		System.out.println(cnt);
	}

}
