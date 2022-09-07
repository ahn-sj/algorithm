package class01;

import java.util.Scanner;

public class NO10950 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = Integer.valueOf(scan.nextLine());
		
		for(int i = 0; i < cnt; i++) {
			String str = scan.nextLine();
			int sum = str.charAt(0)-'0' + str.charAt(2)-'0';
			
			System.out.println(sum);
		}
	}

}
