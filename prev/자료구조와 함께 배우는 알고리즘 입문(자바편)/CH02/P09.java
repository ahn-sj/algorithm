package CH02;

public class P09 {

	public static void main(String[] args) {
		for(int i = 3; i <= 5; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) break;
			}
			System.out.println("+i >" +i);
			
			
		}
		
//	for(int i = 0; i <= 10; i++) {
//		for(int j = 2; j < 10; j++) {
//			if(10 % j == 0) break;
//		}
//	}
		
	}

}
