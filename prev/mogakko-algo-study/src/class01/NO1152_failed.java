// 단어의 개수
package class01;

import java.util.Scanner;

public class NO1152_failed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		String str = scan.nextLine().trim();		
//		System.out.println(str);
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
			if(str.charAt(i) == ' ') cnt++;
		}
		
		System.out.println(cnt+1);
	}
}
