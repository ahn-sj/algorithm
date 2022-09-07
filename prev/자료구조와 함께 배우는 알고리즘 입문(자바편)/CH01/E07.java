package CH01;

import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int sum = 0;
		String str = "";
		
		for(int i = 1; i <= max; i++) {
			sum += i;
			str += i + " + ";
		}
		System.out.println(str.substring(0, str.length()-3) + " = " + sum);
	}

}
