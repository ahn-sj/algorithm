package algobox.doitforjava.chap06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 수를 묶어서 최댓값 만들기
 *
 * sudo:
 * 1. 최소가 되는 경우의 수 찾기
 *
 * limit:
 * - 같은 위치에 있는 자기 자신을 묶는건 불가능
 * - 정답은 2^31 보다 작다 라는 조건이 있으므로 long 으로
 *
 * target: 수열의 수를 적절히 묶었을 때 나오는 최대의 합
 */
public class NO1744 {

    public static PriorityQueue<Integer> plus = new PriorityQueue<>();  // 오름차순
    public static PriorityQueue<Integer> minus = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
    
    public static int zeroCount = 0;
    public static int oneCount = 0;
    
    public static long sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        // base1) 우선 순위 큐 2개가 필요 -> 양수 / 음수
        // base2) 1과 0을 별도로 담아야 함

        // A: 양수
        // 1) 우선 순위 큐는 내림차순 정렬
        // 2) 차례대로 pop 2번 -> 2개의 곱 + sum
        // 3) 1개 남은 경우 그대로 더하기

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            addNumber(num);
        }
        calcPlusQueue();
        calcMinusQueue();

        br.close();
    }

    private static void calcMinusQueue() {
        while (minus.size() > 1) {
            int minusNum1 = minus.poll();
            int minusNum2 = minus.poll();
            sum = sum + (minusNum1 * minusNum2);
        }
        if(!minus.isEmpty()) {

        }
    }

    private static void calcPlusQueue() {
        while (plus.size() > 1) {
            int plusNum1 = plus.poll();
            int plusNum2 = plus.poll();
            sum = sum + (plusNum1 * plusNum2);
        }
        if(!plus.isEmpty()) {
            int plusNum = plus.poll();
            sum = sum + plusNum;
        }
    }

    private static void addNumber(int num) {
        if(num == 0) zeroCount++;
        if(num == 1) oneCount++;
        if(num > 1)  plus.add(num); 
        if(num < 0)  minus.add(num); 
    }
}
