package CH02;

import java.util.Random;

public class E01 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int max = rand.nextInt(10) + 1;
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
