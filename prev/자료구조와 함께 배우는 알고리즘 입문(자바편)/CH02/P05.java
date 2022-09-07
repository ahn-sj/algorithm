package CH02;

import java.util.Random;
import java.util.Scanner;

public class P05 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int[] arr = new int[max];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(190) + 1;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println("최댓값은 " + maxOf(arr) + " 입니다.");
	}

	static int maxOf(int[] _arr) {
		int m = _arr[0];
		for(int i = 1; i < _arr.length; i++) {
			if(m < _arr[i]) m = _arr[i];
		}
		return m;
	}

}
