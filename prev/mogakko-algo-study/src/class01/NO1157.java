// �ܾ� ����
package class01;

import java.util.Arrays;
import java.util.Scanner;

public class NO1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] count = new int[26];
		int maxValue = 0;
		boolean isSame = false;
		int index = 0;
		char c = ' ';
		
		String str = scan.nextLine().toLowerCase();
		
		// �迭�� ���ĺ� ���� ���� (a -> 0, z -> 25)
		for(int i = 0; i < str.length(); i++) count[str.charAt(i)-'a']++;
//			int h = str.charAt(i)- 'a';
//		System.out.print(Arrays.toString(count));
		
		// ���� ���� ���� ���ĺ� ã��
		maxValue = count[0];
		
		for(int i = 1; i < count.length; i++)
			if(maxValue < count[i]) {
				maxValue = count[i];
				index = i;
			}
		
		// ���� ���� ���� ���ĺ� �ߺ� ã�� 
		for(int i = 0; i < count.length; i++) {
			if(i == index) continue;
			if(maxValue == count[i]) isSame = true;
		}
		
		if(isSame == true) c = '?';
		else c = (char) (index + 'A');
		
		System.out.println(c);
	}		
}	