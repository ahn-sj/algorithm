package algobox.doitforjava.chap06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 카드 정렬하기
 * >> 우선순위 큐 동작원리와 힙(완전 이진 트리) 공부
 *
 * sudo:
 *  1. 시작점의 최적의 해를 찾는다
 *  2. 입력값을 큐에 담는다.
 *  3. sort >> 우선순위 큐
 *  4. pop을 2번한다
 *  5. 계산 후 push 1번
 *  6. 큐의 크기가 1이면 종료
 */
public class NO1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int cardPack = Integer.parseInt(br.readLine());

        // Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 2, 3
        for (int i = 0; i < cardPack; i++) {
            queue.add(Integer.valueOf(br.readLine()));
        }

        // 4
        int minCount = 0;
        while (queue.size() > 1) {
            int pack1 = queue.poll();
            int pack2 = queue.poll();

            int sum = pack1 + pack2;
            minCount += sum;

            queue.add(sum);
        }
        System.out.println(minCount);

        br.close();
    }
}
