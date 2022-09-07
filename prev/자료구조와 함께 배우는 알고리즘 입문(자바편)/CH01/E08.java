package CH01;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		
		int sum = (1 + max) * (max / 2);
		System.out.println(sum);
	}

}
