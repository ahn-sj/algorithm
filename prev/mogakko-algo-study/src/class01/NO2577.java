package class01;

import java.util.Scanner;

public class NO2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		int[] cntArr = new int[10];
		
		// 값 입력
		for(int i = 0; i < arr.length; i++) 
			arr[i] = scan.nextInt();
		
		// 계산 및 변환(int to String)
		String mult = String.valueOf(arr[0] * arr[1] * arr[2]);

		// 배열에 값 세기
		for(int i = 0; i < mult.length(); i++) 
			cntArr[(int)(mult.charAt(i)-'0')]++;
		
		// 출력
		for(int i = 0; i < cntArr.length; i++) 
			System.out.println(cntArr[i]);
	}
}
