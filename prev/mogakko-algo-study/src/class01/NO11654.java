// Scanner·Î charÀÔ·Â
// https://security-nanglam.tistory.com/209
package class01;

import java.util.Scanner;

public class NO11654 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ascii = Character.valueOf(scan.next().charAt(0));
		
		System.out.println((int)ascii);
	}

}
