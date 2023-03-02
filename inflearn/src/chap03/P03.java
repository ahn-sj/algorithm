package chap03;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 최대 매출
 */
public class P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int day = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        int[] sales = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxSale = 0;
        for (int i = 0; i < max; i++) {
            maxSale += sales[i];
        }
        int sum = maxSale;

        for (int i = max; i < day; i++) {
            sum = sum + sales[i] - sales[i - max];

            if(sum > maxSale) {
                maxSale = sum;
            }
        }
        bw.write(maxSale + "");

        bw.close();
        br.close();
    }
}
