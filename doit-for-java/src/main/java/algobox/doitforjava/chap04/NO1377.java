package algobox.doitforjava.chap04;

import java.io.*;
import java.util.Arrays;

public class NO1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        Pair[] pairs = new Pair[size + 1];

        final int START = 1;
        final int END = pairs.length;

        for (int i = START; i < END; i++) {
            int value = Integer.parseInt(br.readLine());
            pairs[i] = new Pair(i, value);
        }
        Arrays.sort(pairs, START, END);

        int move = 0;
        for (int i = START; i < END; i++) {
            int key = pairs[i].key;

            int distance = key - i; // 0, 2, 2, -1, -4
            if(distance > move) {
                move = key - i;
            }
        }
        System.out.println(move + 1);

        br.close();
    }

    static class Pair implements Comparable<Pair> {
        private final int key;
        private final int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            return value - o.value;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
