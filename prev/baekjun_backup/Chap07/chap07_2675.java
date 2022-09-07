/*
 * 1. for 3중첩
 * 2. scanner는 공백과 \n으로 구분하기 때문에 
 * "3 ABC"를 입력하고자 한다면 2개의 scanner로
 * 3의 정수와 ABC의 문자열로 입력을 받을 수 있다.
 */

package Baekjoon.Chap07;

import java.util.Scanner;

public class chap07_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < max; i++) {
			int ffor = sc.nextInt();
			String str = sc.nextLine();

			str = str.replaceAll(" ", "");

			for (int j = 0; j < str.length(); j++) {
				for (int z = 0; z < ffor; z++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
