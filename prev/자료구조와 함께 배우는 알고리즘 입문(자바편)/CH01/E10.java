package CH01;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		while(true) {
			int b = sc.nextInt();
			
			if(b - a <= 0) {
				System.out.println("a보다 큰 값을 입력하시오.");
				continue;
			}
			
			System.out.println("b의 값 : " + b);
			System.out.println("b - a : " + (b - a));
		}
		  
	}

}
