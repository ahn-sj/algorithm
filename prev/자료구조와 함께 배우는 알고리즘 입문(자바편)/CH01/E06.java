package CH01;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int max = sc.nextInt();
		int sum = 0;
		
		while(max >= i) {
			sum += i;
			i++;
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
