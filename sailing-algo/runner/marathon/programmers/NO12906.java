package programmers;

import java.util.ArrayList;
import java.util.Iterator;

public class NO12906 {
    public static void main(String[] args) {

    }


    public int[] solution(int []arr) {
        int store = -1;

        ArrayList<Integer> list = new ArrayList<>();;


        for (int i : arr) {
            if(store == i) continue;

            store = i;
            list.add(store);
        }

        int[] answer = new int[list.size()];
        Iterator<Integer> iter = list.iterator();

        for (int i = 0; i < list.size(); i++) {
            answer[i] = iter.next().intValue();
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }


}
