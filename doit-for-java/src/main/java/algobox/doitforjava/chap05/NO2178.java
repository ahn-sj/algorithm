package algobox.doitforjava.chap05;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Queue;
import java.util.*;

public class NO2178 {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n;
    static int m;

    static boolean[][] checked;
    static List<int[]> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        checked = new boolean[n][m];

        for (int i = 0; i < n; i++) list.add(new int[m]);

        // 2. connect
        for (int i = 0; i < n; i++) {
            int[] line = convertArrayStringToInt(br.readLine().split(""));

            for (int j = 0; j < line.length; j++) {
                list.get(i)[j] = line[j];
            }
        }
        bfs(0,0);
        System.out.println(list.get(n - 1)[m - 1]);

        br.close();
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        checked[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nowX = point.x + dx[i];
                int nowY = point.y + dy[i];

                if(nowX < 0 || nowY < 0 || nowX >= n || nowY >= m) continue;
                if(checked[nowX][nowY] || list.get(nowX)[nowY] == 0) continue;

                queue.add(new Point(nowX, nowY));
                checked[nowX][nowY] = true;
                list.get(nowX)[nowY] = list.get(point.x)[point.y] + 1;
            }
        }
    }

    private static int[] convertArrayStringToInt(String[] line) {
        return Arrays.stream(line).mapToInt(s -> Integer.parseInt(s)).toArray();
    }
}
