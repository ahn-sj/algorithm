package algobox.doitforjava.chap05;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class NO2178 {
    public static void main(String[] args) throws IOException {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        boolean[][] checked = new boolean[row][col];
        List<int[]> miro = new ArrayList<>();

        createAdjacencyList(row, col, miro);
        connectNodeByEdge(br, row, col, miro);

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        checked[0][0] = true;

        while (hasElementBy(queue)) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nowX = point.x + dx[i];
                int nowY = point.y + dy[i];

                if(nowX < 0 || nowY < 0 || nowX >= row || nowY >= col) continue;
                if(checked[nowX][nowY] || miro.get(nowX)[nowY] == 0) continue;

                queue.add(new Point(nowX, nowY));
                checked[nowX][nowY] = true;
                miro.get(nowX)[nowY] = miro.get(point.x)[point.y] + 1;
            }
        }
        System.out.println(miro.get(row - 1)[col - 1]);

        br.close();
    }

    private static boolean hasElementBy(Queue<Point> queue) {
        return !queue.isEmpty();
    }

    private static void createAdjacencyList(int row, int col, List<int[]> miro) {
        for (int i = 0; i < row; i++) {
            miro.add(new int[col]);
        }
    }

    private static void connectNodeByEdge(BufferedReader br, int row, int col, List<int[]> miro) throws IOException {
        for (int i = 0; i < row; i++) {
            String[] line = br.readLine().split("");

            for (int j = 0; j < col; j++) {
                miro.get(i)[j] = Integer.parseInt(line[j]);
            }
        }
    }
}
