package class01;

import java.util.Scanner;

public class NO2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		
		if(minute >= 45) {
			System.out.println(hour + " " + (minute-45));			
		} else {
			if(hour != 0) System.out.println(hour-1 + " " + (minute+60-45));
			else System.out.println(23 + " " + (minute+60-45));
		}
	}
}