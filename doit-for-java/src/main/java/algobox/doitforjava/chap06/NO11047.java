package algobox.doitforjava.chap06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 동전 개수의 최솟값 구하기
 */
public class NO11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int coinCount = Integer.parseInt(input[0]);
        int target = Integer.parseInt(input[1]);

        int[] coins = new int[coinCount];

        for (int i = 0; i < coinCount; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        // target: 4200
        // 1000 -> 4
        // 100  -> 2

        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if(coins[i] <= target) {
                count = count + (target / coins[i]);
                target = target % coins[i];
            }
        }
        System.out.println(count);

        br.close();
    }
}
