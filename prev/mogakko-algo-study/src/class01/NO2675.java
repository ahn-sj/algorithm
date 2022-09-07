package class01;

import java.util.Scanner;

public class NO2675 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = Integer.valueOf(scan.nextLine());
		
		for(int i = 0; i < max; i++) {
			String str = scan.nextLine();
			
			strRepe(str);
		}
	}
	
	static void strRepe(String strPara) {
		int upper = 2;
		int num = strPara.charAt(0)-'0';
		String str = strPara.substring(2,strPara.length());
		
//		System.out.println(num + " << >> " + str);
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < num; j++) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
	}
}
