package programmers;

import java.util.Arrays;

public class __NO12917 {
    public static void main(String[] args) {
        __NO12917 no12917 = new __NO12917();

        no12917.solution("Zbcdefg");
    }

    public String solution(String s) {
        String[] split = s.split("");
        Arrays.sort(split);

        StringBuffer sb = new StringBuffer();

        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]);
        }

        System.out.println(Arrays.toString(split));
        System.out.println(sb);


        String answer = sb + "";

        return answer;
    }
}
