package class02;

import java.util.Scanner;

public class NO2231 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str =scan.nextLine();
		int max = Integer.valueOf(str);
		int cstr = 0;
		String tmpStr = "";
		
		for(int i = 0; i < max; i++) {
			cstr = i;
			tmpStr = String.valueOf(i);
			
			for(int j = 0; j < tmpStr.length(); j++)
				cstr += Integer.valueOf(tmpStr.charAt(j)-'0');
				
//			System.out.println(i + "<< >>" +cstr);
			
			if(cstr == max) {
				System.out.println(i);
				break;
			}
			else if(i == max-1) System.out.println("0");
		}
	}
}