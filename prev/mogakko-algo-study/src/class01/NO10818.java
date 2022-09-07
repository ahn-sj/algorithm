package class01;

import java.util.Scanner;

public class NO10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		
		int min = 1000000;
		int max = -1000000;
		
		for(int i = 0; i < cnt; i++) {
			int num = scan.nextInt();
			
			if(min > num) min = num;
			if(max < num) max = num;
		}
		System.out.println(min + " " + max);
	}

}
