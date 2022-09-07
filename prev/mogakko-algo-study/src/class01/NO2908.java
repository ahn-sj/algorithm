package class01;

import java.util.Scanner;

public class NO2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int str1 = Integer.valueOf("" + str.charAt(2) + str.charAt(1) + str.charAt(0));
		int str2 = Integer.valueOf("" + str.charAt(6) + str.charAt(5) + str.charAt(4));
//		System.out.println(str1 + " <> " + str2);
		
		if(str1 > str2) System.out.println(str1);
		else System.out.println(str2);
	}
}