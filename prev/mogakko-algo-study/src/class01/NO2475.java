package class01;

import java.util.Scanner;

public class NO2475 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		int sum = 0;
		
		
		for(int i = 0; i < str.length(); i+=2) {
			int temp = str.charAt(i)-'0';
			
//			temp = (int) Math.pow(temp, 2);
			sum += temp*temp;
		}
		System.out.println(sum%10);
	}
}
