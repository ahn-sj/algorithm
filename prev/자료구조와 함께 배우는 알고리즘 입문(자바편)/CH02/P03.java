package CH02;

import java.util.Arrays;

public class P03 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1.clone();
		
		arr2[3] = 0;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
