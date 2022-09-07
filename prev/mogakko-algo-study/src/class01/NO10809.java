// 배열에 있는 모든 요소를 원하는 값으로 초기화
// https://www.delftstack.com/ko/howto/java/java-initialize-array-elements-to-zero/
package class01;

import java.util.Arrays;
import java.util.Scanner;

public class NO10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int[] cntArr = new int[26];
		String resultStr = "";
		
		Arrays.fill(cntArr, -1);
		
		for(int i = 0; i < str.length(); i++) 
			cntArr[str.charAt(i)-'a'] = str.indexOf(str.charAt(i));
		
		for(int i = 0; i < cntArr.length; i++)
			resultStr += cntArr[i] + " "; 
		
		System.out.println(resultStr);
	}
}
