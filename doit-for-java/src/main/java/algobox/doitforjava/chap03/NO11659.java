package algobox.doitforjava.chap03;

import java.io.*;

/**
 * 문제003. 구간 합 구하기
 */
public class NO11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");

        int data = Integer.parseInt(firstLine[0]);
        int question = Integer.parseInt(firstLine[1]);

        long[] targets = new long[data + 1];

        String[] splits = br.readLine().split(" "); // 5 4 3 2 1
        for (int i = 1; i <= data; i++) {
            targets[i] = targets[i-1] + Long.valueOf(splits[i - 1]);
        }

        for (int i = 0; i < question; i++) {
            String[] sections = br.readLine().split(" ");

            int startedIndex = Integer.parseInt(sections[0]);
            int endedIndex = Integer.parseInt(sections[1]);

            bw.write((targets[endedIndex] - targets[startedIndex - 1]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
