package CH01;

import java.util.Scanner;

public class E14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		for(int i = 0; i < dan; i++) {
			for(int j = 0; j < dan; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
