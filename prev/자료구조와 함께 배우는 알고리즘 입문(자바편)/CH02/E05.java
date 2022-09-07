package CH02;

import java.util.Arrays;
import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {
		int[] arrA = setArr();
		int[] arrB = setArr();
		
		rcopy(arrA, arrB);
		
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
	}

	static void rcopy(int[] arrA, int[] arrB) {
		int num = arrA.length <= arrB.length ? arrA.length : arrB.length;
		
		for(int i = 0; i < num; i++) {
			arrA[i] = arrB[arrB.length - 1 - i];
		}
	}
	
	// set Array
	static int[] setArr() { 
		Scanner sc = new Scanner(System.in);
		
		int arrLen = sc.nextInt();
		int[] arr = new int[arrLen];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		return arr;
	}
}
