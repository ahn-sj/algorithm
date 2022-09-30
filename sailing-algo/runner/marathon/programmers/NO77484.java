package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class NO77484 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] ranks = {6, 5, 4, 3, 2};
            int cnt = 0;
            int erasedNumber = 0;

            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < lottos.length; i++) {
                list.add(lottos[i]);

                if(lottos[i] == 0) {
                    erasedNumber++;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if(list.contains(win_nums[i])) {
                    cnt++;
                }
            }
//            System.out.println(cnt + ", " + erasedNumber);

            int[] answer = {6, 6};

            for(int i = 0; i < ranks.length; i++) {
                if(ranks[i] == cnt + erasedNumber) {
                    answer[0] = i + 1;
                }
                if(ranks[i] == cnt) {
                    answer[1] = i + 1;
                }
            }
            return answer;
        }
    }
}
