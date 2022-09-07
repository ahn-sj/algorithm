package class01;

import java.util.Scanner;

public class NO11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = Integer.valueOf(scan.nextLine());
		int sum = 0;
		
		String str = scan.nextLine();
				
		for(int i = 0; i < str.length(); i++) sum += str.charAt(i)-'0';
		
		System.out.println(sum);
	}
}