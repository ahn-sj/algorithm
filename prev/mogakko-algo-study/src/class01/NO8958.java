package class01;

import java.util.Scanner;

public class NO8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = Integer.valueOf(scan.nextLine());
		
		for(int i = 0; i < cnt; i++) {
			int score = 0;
			int totalScore = 0;
			
			String ox = scan.nextLine();
			
			for(int j = 0; j < ox.length(); j++) {
				if(ox.charAt(j) == 'O') {
					score++;
					totalScore += score;
//					System.out.println(score + " << >> " + totalScore);
				}
				else if(ox.charAt(j) == 'X') {
					score = 0;
				}
			}
			System.out.println(totalScore);
//			System.out.println("----------");
		}
	}
}