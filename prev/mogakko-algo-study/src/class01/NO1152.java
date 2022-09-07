// 단어의 개수
/*
 * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
 * 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 * 
 * 문제를 제대로 읽지않고 trim()으로 해결하려 해서 풀지 못한 문제  
 * */
package class01;

import java.util.Scanner;

public class NO1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		String str = scan.nextLine().toLowerCase();
		boolean bool = false;
//		System.out.println(str);
		
		for(int i = 0; i < str.length(); i++) {
			if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				if(bool == true) continue;
				bool = true;
				cnt++;
			}
			else if(str.charAt(i) == ' ') bool = false;
			}
		System.out.println(cnt);
		}
}