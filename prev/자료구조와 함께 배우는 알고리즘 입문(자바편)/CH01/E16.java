package CH01;

import java.util.Scanner;

public class E16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		spira(dan);
	}
	
	static void spira(int _n) {
		for(int i = 1; i < _n; i++) {
			for(int j = _n; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= (i-1) * 2 + 1; j+=2) {
				System.out.print("*");
//				System.out.println(j);
			}
			System.out.println();
		}
	}

}
