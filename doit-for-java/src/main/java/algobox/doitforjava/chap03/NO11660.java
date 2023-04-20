package algobox.doitforjava.chap03;

import java.io.*;

/**
 * N x N 2차원 배열이 있다고 했을 때
 * (X1, Y1) ~ (X2, Y2)까지의 합을 구하시오
 */
public class NO11660 {
    public static void main(String[] args) throws IOException {
        /**
         * 1. 원본 2차원 배열 값 초기화
         * 2. 합 배열 초기화
         * 3. 구간 합 구하기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] size = br.readLine().split(" ");
        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        int[][] tables = new int[row + 1][row + 1];
        int[][] result = new int[row + 1][row + 1];

        for (int i = 1; i <= row; i++) {
            String[] line = br.readLine().split(" ");

            for (int j = 1; j <= row; j++) {
                tables[i][j] = Integer.parseInt(line[j - 1]);
            }
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                result[i][j] = result[i][j - 1] + result[i - 1][j] - result[i - 1][j - 1] + tables[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            String[] range = br.readLine().split(" ");

            int x1 = Integer.parseInt(range[0]);
            int y1 = Integer.parseInt(range[1]);
            int x2 = Integer.parseInt(range[2]);
            int y2 = Integer.parseInt(range[3]);

            bw.write(result[x2][y2] + result[x1 - 1][y1 - 1] - result[x1 - 1][y2] - result[x2][y1 - 1] + "\n");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
