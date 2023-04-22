package algobox.doitforjava.chap03;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class NO11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Comparator<Integer> comparator = createComparator();
        PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);

        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int value = Integer.parseInt(br.readLine());

            if(value == 0) sb.append(checkElement(queue)).append("\n");
            else queue.add(value);
        }
        System.out.println(sb + "");

        bw.close();
        br.close();
    }

    private static int checkElement(PriorityQueue<Integer> queue) {
        return queue.isEmpty() ? 0 : queue.poll();
    }

    private static Comparator<Integer> createComparator() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if (abs1 == abs2) return o1 > o2 ? 1 : -1;
                return abs1 - abs2;
            }
        };
    }
}
