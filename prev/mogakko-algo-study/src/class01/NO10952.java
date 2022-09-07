package class01;

import java.util.Scanner;

public class NO10952 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) {
			int lv = scan.nextInt();
			int rv = scan.nextInt();
			
			if(lv == 0 && rv == 0) break;
			
			System.out.println(lv+rv);
		}
	}
}
