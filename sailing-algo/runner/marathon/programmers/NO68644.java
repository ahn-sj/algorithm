package programmers;

import java.util.*;

public class NO68644 {
    public static void main(String[] args) {

    }
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        int cnt = 1;

        for (int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }

        HashSet<Integer> set = new HashSet<>(list);
        list = new ArrayList<Integer>(set);
        Collections.sort(list);

        int[] answer = new int[list.size()];
        Iterator<Integer> iter = list.iterator();

        for (int i = 0; i < list.size(); i++) {
            answer[i] = iter.next().intValue();
        }
        return answer;
    }
}
