package algobox.doitforjava.chap03;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class NO2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();
        int card = Integer.parseInt(br.readLine());

        for (int i = 1; i <= card; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());

        br.close();
    }
}
