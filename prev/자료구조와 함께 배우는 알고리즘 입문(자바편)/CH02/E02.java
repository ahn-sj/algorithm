package CH02;

import java.util.Arrays;
import java.util.Random;

public class E02 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int max = rand.nextInt(10) + 1;
		int[] arr = new int[max];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(190) + 1;
		}
		System.out.println("Reverse Before : " + Arrays.toString(arr));
		System.out.println("------------------------");
		reverseArr(arr);
		System.out.println("Reverse After :  " + Arrays.toString(arr));
	}
	
	static void reverseArr(int[] _arr) {
		int temp = 0;
		
		for(int i = 0; i < _arr.length / 2; i++) {
			temp = _arr[(_arr.length - 1 - i)];
			_arr[_arr.length - 1 - i] = _arr[i];
			_arr[i] = temp;
			
			System.out.println("a[" + i + "] 와 a[" + (_arr.length - 1 - i) + "]를 교환합니다");
			System.out.println(Arrays.toString(_arr));
			System.out.println("------------------------");
		}
	}
}
