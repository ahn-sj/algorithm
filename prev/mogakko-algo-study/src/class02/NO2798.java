package class02;

import java.util.Scanner;

public class NO2798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int blackJack = scan.nextInt();
		int[] numArr = new int[cnt];
		int checkedBJ = 0;
		
		// cnt개의 값 입력
		for(int i = 0; i < numArr.length; i++) numArr[i] = scan.nextInt();
		
		for(int i = 0; i < numArr.length-2; i++) {
			// 3자리수
			if(cnt == 3) { 
				checkedBJ = numArr[i] + numArr[i+1] + numArr[i+2]; break; 
			}
			
			// 4자리수 이상
			for(int j = i+1; j < numArr.length-1; j++) {
				for(int z = j+1; z < numArr.length; z++) {
					int temp = numArr[i] + numArr[j] + numArr[z];	
					if(checkedBJ < temp && temp <= blackJack) checkedBJ = temp;
//					System.out.println("i = " + i + ", j = " + j + ", j+1 = " + (z));
//					System.out.println(numArr[i] + " " + numArr[j] + " " + numArr[z]);
//					System.out.println("-----------------------------");
				}
			}
		}
		System.out.println(checkedBJ);
	}

}
