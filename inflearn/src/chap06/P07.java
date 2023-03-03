package chap06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 좌표 정렬
 */
public class P07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Point> points = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            points.add(new Point(x, y));
        }
        Collections.sort(points);

        for (Point point : points) {
            sb.append(point.getX() + " " + point.getY()).append("\n");
        }
        System.out.println(sb);
    }
}

class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}
