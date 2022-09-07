package CH01;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numArr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			numArr[i] = sc.nextInt();
		}
		Arrays.sort(numArr);
		System.out.println(numArr[numArr.length/2]);
	}

}
