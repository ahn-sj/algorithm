package CH01;

public class P02 {

	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				for(int z = 1; z < 4; z++) {
					if(maxNumberOfCases(i, j, z) == 3) {
						cnt++;
						System.out.println("max3(" + i + ", " + j + ", " + z + ") = " + maxNumberOfCases(i, j, z) + " count => " + cnt);
					}
				}
			}
		}
		
	}
	
	static int maxNumberOfCases(int _i, int _j, int _z) {
		int a = _i; 	int b = _j;		int c = _z;
		
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}

}
