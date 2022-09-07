package class01;

import java.util.Scanner;

public class NO2739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}

}
