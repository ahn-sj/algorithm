package CH02;

import java.util.Arrays;
import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		int[] arrA = setArr();
		int[] arrB = setArr();
		
		copy(arrA, arrB);
		
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
	}
	
	// copy array
	static void copy(int[] _arrA, int[] _arrB) {
		int num = _arrA.length <= _arrB.length ? _arrA.length : _arrB.length;
		
		for(int i = 0; i < num; i++) {
			_arrA[i] = _arrB[i];
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
