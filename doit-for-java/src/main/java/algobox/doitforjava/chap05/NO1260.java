package algobox.doitforjava.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NO1260 {
    
    static boolean[] checked;
    static int node;
    static List<int[]> list;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        node = Integer.parseInt(input[0]);
        int edge = Integer.parseInt(input[1]);
        int start = Integer.parseInt(input[2]);

        System.out.println("3".toUpperCase());

        checked = new boolean[node + 1];

        for (int i = 0; i <= node; i++) {
            list.add(new int[node + 1]);
        }
        for (int i = 0; i < edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            list.get(row)[col] = 1;
            list.get(col)[row] = 1;
        }

        dfs(start);
        bfs(start);

        br.close();
    }

    private static void bfs(int start) {
        Arrays.fill(checked, false);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        checked[start] = true;

        sb.append("\n");

        while (queueHasElement(queue)) {
            int element = queue.poll();
            sb.append(element + " ");

            for (int i = 1; i <= node; i++) {
                if(!checked[i] && list.get(element)[i] == 1) {
                    queue.add(i);
                    checked[i] = true;
                }
            }
        }
        System.out.println(sb + "");
    }

    private static void dfs(int start) {
        checked[start] = true;
        sb.append(start + " ");

        for (int i = 1; i <= node; i++) {
            if(!checked[i] && list.get(start)[i] == 1) {
                dfs(i);
            }
        }
    }

    private static boolean queueHasElement(Queue<Integer> queue) {
        return !queue.isEmpty();
    }
}
