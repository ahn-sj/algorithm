/* ******************************** */
/* 			�� ���� �ִ� 			*/
/* ******************************** */

package CH01;

import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		
		if(b > max) max = b;
		else if(c > max) max = c;
		
		System.out.println("max > " + max);
	}

}
