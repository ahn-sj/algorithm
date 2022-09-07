package Baekjoon.Chap05;

import java.util.Scanner;

public class chap05_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		float max = 0;
		float sum = 0;

		int cnt = sc.nextInt();
		float[] arr_cnt = new float[cnt];

		for (int i = 0; i < cnt; i++) {
			arr_cnt[i] = sc.nextInt();

			if (arr_cnt[i] > max)
				max = arr_cnt[i];
		}

		for (int i = 0; i < arr_cnt.length; i++) {
			arr_cnt[i] = arr_cnt[i] / max * 100;
			sum += arr_cnt[i];
		}

		System.out.println(Math.round((sum / cnt) * 100) / 100.0);
	}

}
