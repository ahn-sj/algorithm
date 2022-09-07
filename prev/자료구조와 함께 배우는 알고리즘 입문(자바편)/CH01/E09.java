package CH01;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sumValue = 0;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) sumValue = sumof(a, b);
		else sumValue = sumof(b, a);
		
		System.out.println(sumValue);
	}
	
	static int sumof(int _x, int _y) {
		int sum = _x + _y;
		
		while(true) {
			_x++;
			if(_x == _y) break;
			
			sum += _x;			
//			System.out.println(_x + " " + sum);
		}
		return sum;
	}
}
