package algobox.doitforjava.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NO1427 {
    /**
     * 데이터 순서대로 제일 작은 값을 찾아 바꾼다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = Arrays.stream(br.readLine().split("")).mapToInt(s -> Integer.parseInt(s)).toArray();

        for (int i = 0; i < ints.length; i++) {
            int index = i;
            for (int j = i + 1; j < ints.length; j++) {
                if(ints[j] > ints[index]) { // 최댓값 찾기
                    index = j;
                }
            }
            swap(ints, i, index);
        }

        StringBuilder sb = new StringBuilder();
        for (int value : ints) {
            sb.append(value);
        }
        System.out.println(sb + "");

        br.close();
    }

    private static void swap(int[] ints, int now, int max) {
        int tmp = ints[max];
        ints[max] = ints[now];
        ints[now] = tmp;
    }
}
