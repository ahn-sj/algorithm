package class01;

import java.util.Scanner;

public class NO3052 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] cntArr = new int[42];
		int cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			
			cntArr[num % 42]++;
		}
		
		for(int i = 0; i < cntArr.length; i++)
			if(cntArr[i] != 0) cnt++;
		
		System.out.println(cnt);
	}

}
