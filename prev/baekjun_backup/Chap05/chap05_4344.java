package Baekjoon.Chap05;

import java.util.Scanner;

public class chap05_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total_max = sc.nextInt();

		for (int i = 0; i < total_max; i++) {
			int sum = 0;
			int cnt = 0;

			int[] max = new int[sc.nextInt()];
			for (int j = 0; j < max.length; j++) {
				max[j] = sc.nextInt();
				sum += max[j];
			}
			double avg = sum / max.length;
			// 100.0 * 2 / 5
			for (int j = 0; j < max.length; j++) {
				if (max[j] > avg) cnt++;
			}
			System.out.println(String.format("%.3f", 100.0 * cnt / max.length) + "%");
		}
	}

}
