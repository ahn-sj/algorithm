package algobox.doitforjava.chap06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1. 현재 상태에서 최선인 방법을 찾는다.
 * 2. 선택한 해가 제약 조건에 벗어나지 않는지 검사한다.
 * 3. 현재까지 선택한 해 집합이 전체 문제를 해결할 수 있는지 검사한다.
 */
public class NO11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int coinCount = Integer.parseInt(st.nextToken());
        int targetPrice = Integer.parseInt(st.nextToken());

        int[] coins = new int[coinCount];

        int count = 0;

        for (int i = 0; i < coinCount; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        // 5 10 50 100 500 1000
        // 4200

        for (int i = coinCount - 1; i >= 0; i--) {
            if(coins[i] <= targetPrice) {
                count = count + (targetPrice / coins[i]);
                targetPrice = targetPrice % coins[i];
            }
        }
        System.out.println(count);

        br.close();
    }
}
