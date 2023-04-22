package algobox.doitforjava.chap03;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class NO17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int size = Integer.parseInt(br.readLine());

        int[] seq = Arrays
                .stream(br.readLine().split(" "))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();

        stack.push(0);
        for (int i = 1; i < size; i++) {
            while (hasElement(stack) && isBigSeqIndexThanSeqStackPeek(seq, stack.peek(), i)) {
                seq[stack.pop()] = seq[i];
            }
            stack.push(i);
        }

        while (hasElement(stack)) {
            seq[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int value : seq) {
            sb.append(value).append(" ");
        }
        bw.write(sb + "");
        bw.flush();

        bw.close();
        br.close();
    }

    private static boolean isBigSeqIndexThanSeqStackPeek(int[] seq, Integer peek, int i) {
        return seq[i] > seq[peek];
    }

    private static boolean hasElement(Stack<Integer> stack) {
        return !stack.empty();
    }
}
