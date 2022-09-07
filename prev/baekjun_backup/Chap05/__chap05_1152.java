/*
 * trim()은 앞뒤 공백을 제거하는 메서드
 * 
 * */
package Baekjoon.Chap05;

import java.util.Scanner;

public class __chap05_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 1;
		
		String str = sc.nextLine().trim();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				cnt++;
		}
		System.out.println(cnt);
	}

}
