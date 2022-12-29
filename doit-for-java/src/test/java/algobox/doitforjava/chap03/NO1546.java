package algobox.doitforjava.chap03;

import java.util.Scanner;

public class NO1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer subject = scan.nextInt();
        Float[] grades = new Float[subject];

        float max = 0;
        float sum = 0;

        for (int i = 0; i < grades.length; i++) {
            Float grade = scan.nextFloat();
            if(grade > max) {
                max = grade;
            }
            grades[i] = grade;
        }

        for (int i = 0; i < grades.length; i++) {
            grades[i] = grades[i] / max * 100;
            sum += grades[i];
        }
        System.out.println(sum / subject);
    }
}
