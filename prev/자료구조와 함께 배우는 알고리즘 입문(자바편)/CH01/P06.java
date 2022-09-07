package CH01;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.print("n의 값 : ");
			int num = sc.nextInt();
			
			if(num <= 0) {
				System.out.println("입력한 값은 0보다 큰 값 이어야 합니다.");
				continue;
			}
			
			for(int i = 1; i <= num; i++) sum += i;
			
			System.out.println("------------");
			System.out.println(sum);
			
			break;
		}
	}

}
