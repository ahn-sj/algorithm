package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NO12935 {
    public static void main(String[] args) {
        NO12935 no12935 = new NO12935();

        int[] arr = {4,3,2,1};
        no12935.solution(arr);
    }

    public int[] solution(int[] arr) {

        if(arr.length == 0) {
            return new int[]{-1};
        }

        List<Integer> list = new ArrayList<>();

        int min = arr[0];
        for (int i : arr) {
            if(i < min) {
                min = i;
            }
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(min == num) {
                list.remove(i);
            }
        }
        int[] answer = new int[list.size()];

        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
