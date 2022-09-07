package Bronze05;

import java.util.Scanner;

public class NO2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pers = sc.nextInt();
		int area = sc.nextInt();

		int msum = pers * area;
		int prt = 0;

		for (int i = 0; i < 5; i++) {
			int article = sc.nextInt();

			System.out.printf("%d ", article - msum);
		}
	}
}
