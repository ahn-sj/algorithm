package algobox.doitforjava.chap03;

import java.io.*;

/**
 * 1번째 줄: 수의 개수, 합을 구해야 하는 횟수
 * 2번째 줄: 수
 * 3번째 줄 ~: 구간 합 수
 */
public class NO11659_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] targets = new int[n + 1];
        int[] result = new int[n + 1];

        String[] numbers = br.readLine().split(" "); // 5 4 3 2 1
        for (int i = 1; i < targets.length; i++) {
            targets[i] = Integer.parseInt(numbers[i - 1]);
        }
        for (int i = 1; i < targets.length; i++) {
            result[i] = targets[i] + result[i - 1];
        }
        for (int i = 0; i < m; i++) {
            String[] values = br.readLine().split(" ");
            int x = Integer.parseInt(values[0]);
            int y = Integer.parseInt(values[1]);

            bw.write(result[y] - result[x - 1] + "\n");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
