package class01;

import java.util.Scanner;

public class NO10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int max = scan.nextInt();
		
		int[] cntArr = new int[cnt];
		
		for(int i = 0; i < cntArr.length; i++) cntArr[i] = scan.nextInt();
		for(int i = 0; i < cntArr.length; i++) 
			if(cntArr[i] < max)
				System.out.print(cntArr[i] + " ");
	}

}
