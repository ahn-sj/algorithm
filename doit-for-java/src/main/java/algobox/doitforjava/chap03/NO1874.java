package algobox.doitforjava.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NO1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int count = Integer.parseInt(br.readLine());
        int index = 1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            int seq = Integer.parseInt(br.readLine());

            for (int j = index; j <= seq; j++) {
                stack.add(j);
                sb.append("+").append("\n");
                index++;
            }
            if(stack.peek() == seq) stack.pop();

            sb.append("-").append("\n");
        }
        if(stack.size() == 0) System.out.println(sb + "");
        else System.out.println("NO");

        br.close();
    }
}
