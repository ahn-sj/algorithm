package CH02;

import java.util.Arrays;
import java.util.Scanner;

public class P07 {
	public static void main(String[] args) {
		
		int[] arrA = setArr();
		int[] arrB = setArr();
		
		if(equalsMtd(arrA, arrB) == true) System.out.println("같습니다"); 
		else System.out.println("다릅니다.");
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
	
	// equals (not override. create equals method.)
	static boolean equalsMtd(int[] _arrA, int[] _arrB) {
		if(_arrA.length != _arrB.length) return false;
		
		for(int i = 0; i < _arrA.length; i++) {
			if(_arrA[i] != _arrB[i]) return false;
		}
		return true;
	}
	

}
	
