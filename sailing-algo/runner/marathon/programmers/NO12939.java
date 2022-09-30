package programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NO12939 {
    public static void main(String[] args) {
        NO12939 no12939 = new NO12939();

        no12939.solution("10 -5 -3 -10 0 100 200");
    }

    public String solution(String s) {
        String[] split = s.split(" ");

//        System.out.println(Arrays.toString(split));

        int max = Integer.parseInt(split[0]);
        int min = Integer.parseInt(split[0]);

        System.out.println(min + ", " + max);

        for (int i = 1; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            if(max <= num) {
                max = num;
            } else if(min >= num) {
                min = num;
            }
        }
        System.out.println(min + ", " + max);

        String answer = min + " " + max;
        return answer;
    }
}
