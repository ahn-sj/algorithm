package class01;

import java.util.Scanner;

public class NO2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		int[] cntArr = new int[10];
		
		// �� �Է�
		for(int i = 0; i < arr.length; i++) 
			arr[i] = scan.nextInt();
		
		// ��� �� ��ȯ(int to String)
		String mult = String.valueOf(arr[0] * arr[1] * arr[2]);

		// �迭�� �� ����
		for(int i = 0; i < mult.length(); i++) 
			cntArr[(int)(mult.charAt(i)-'0')]++;
		
		// ���
		for(int i = 0; i < cntArr.length; i++) 
			System.out.println(cntArr[i]);
	}
}
