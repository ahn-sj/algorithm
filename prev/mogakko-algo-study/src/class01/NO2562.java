package class01;

import java.util.Scanner;

public class NO2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = scan.nextInt();
			
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.printf("%d\n%d", max, index+1);
	}
}