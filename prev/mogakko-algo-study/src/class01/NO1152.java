// �ܾ��� ����
/*
 * ù �ٿ� ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. 
 * ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.
 * 
 * ������ ����� �����ʰ� trim()���� �ذ��Ϸ� �ؼ� Ǯ�� ���� ����  
 * */
package class01;

import java.util.Scanner;

public class NO1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		String str = scan.nextLine().toLowerCase();
		boolean bool = false;
//		System.out.println(str);
		
		for(int i = 0; i < str.length(); i++) {
			if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				if(bool == true) continue;
				bool = true;
				cnt++;
			}
			else if(str.charAt(i) == ' ') bool = false;
			}
		System.out.println(cnt);
		}
}