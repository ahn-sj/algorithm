package programmers;

import java.util.Arrays;

public class NO12915 {
    public static void main(String[] args) {
        NO12915 no12915 = new NO12915();
        String[] ss = {"sun", "bed", "car"};

        String[] rsts = no12915.solution(ss, 1);

        for(int i = 0; i < rsts.length; i++) {
            System.out.println(rsts[i]);
        }
    }
    public String[] solution(String[] strings, int n) {

        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(n);

            strings[i] = c + strings[i];
        }

        Arrays.sort(strings);

        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }

        String[] answer = strings;
        return answer;
    }
}
