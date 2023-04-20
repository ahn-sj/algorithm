package algobox.doitforjava.chap03;

import java.io.*;

/**
 * N개의 수가 주어졌을 때 연속된 부분의 합이 M으로 나누어떨어지는 구간의 개수를 구하시오
 */
public class _NO10986 {
    public static void main(String[] args) throws IOException {
        /**
         * 설명은 p56
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        int lp = 1;
        int rp = 1;

        int count = 1;
        int sum = 1;

        while (rp != number) {
            if(sum == number) {
                count++;
                rp++;

                sum = sum + rp;
            } else if(sum < number) {
                rp++;

                sum = sum + rp;
            } else if(sum > number) {
                sum  = sum - lp;
                lp++;
            }
        }
        bw.write(count + "\n");

        bw.close();
        br.close();
    }
}
