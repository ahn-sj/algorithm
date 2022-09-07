// 두 수 비교하기
package class01;

import java.util.Scanner;

public class NO1330 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lv = scan.nextInt();
		int rv = scan.nextInt();
		
		if(lv > rv) System.out.println(">");
		else if(lv < rv) System.out.println("<");
		else System.out.println("==");
	}
}