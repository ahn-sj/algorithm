package Baekjoon.Chap07;

import java.util.Scanner;

public class chap07_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		chg c1 = new chg(sc.nextInt());
		chg c2 = new chg(sc.nextInt());
		int num1 = c1.getFin();
		int num2 = c2.getFin();

		if (num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
	}

}

class chg {
	private int num;
	private int fin = 0;

	public chg(int num) {
		this.num = num;

		this.fin = (this.num / 100) + (((this.num / 10) % 10) * 10) 
				+ (this.num % 10) * 100;
	}

	public int getFin() {
		return this.fin;
	}

}
