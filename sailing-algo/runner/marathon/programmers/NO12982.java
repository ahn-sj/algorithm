package programmers;

import java.util.Arrays;

public class NO12982 {
    public static void main(String[] args) {

    }

    public int solution(int[] d, int budget) {

        Arrays.sort(d);

        int sum = 0;
        int answer = 0;

        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            answer++;

            if(sum > budget) {
                answer--;
                break;
            } else if(sum == budget) {
                break;
            }
        }
        System.out.println(answer);

        return answer;
    }

}
