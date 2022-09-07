package class01;

import java.util.Scanner;

public class NO2920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().replaceAll(" ", "");
		
//		System.out.println(str);
		if(str.equals("12345678")) System.out.println("ascending");
		else if(str.equals("87654321")) System.out.println("descending");
		else System.out.println("mixed");
	}
}
