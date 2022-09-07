package class01;

import java.util.Scanner;

public class NO1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		float max = 0.0f;		
		float sum = 0.0f;
		
		float[] scoreArr = new float[count];
		
		// 최대값 찾기
		for(int i = 0; i < count; i++) {
			scoreArr[i] = scan.nextInt();
			if(max < scoreArr[i]) max = scoreArr[i];
		}
//		System.out.println("max >> " + max);
		
		for(int i = 0; i < scoreArr.length; i++) {
			scoreArr[i] = scoreArr[i]/max*100;
			
			sum += scoreArr[i];
//			System.out.println("scoreArr[" + i + "] >> " + scoreArr[i]);
		}
		System.out.println(sum/count);
	}
}
