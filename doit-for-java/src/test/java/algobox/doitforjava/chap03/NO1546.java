package algobox.doitforjava.chap03;

import java.io.*;

/**
 * 1. 자기 점수 중 최댓값을 고른다
 * 2. 최대값을 M이라고 할 때 모든 점수에 점수/M*100으로 고친다.
 * 3. 이 방법으로 계싼했을 떄 새로운 평균을 구하시오
 */
public class NO1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int subject = Integer.parseInt(br.readLine());
        String[] subjects = br.readLine().split(" ");

        // 1.
        double max = 0;
        for (String value : subjects) {
            int grade = Integer.parseInt(value);
            if(grade > max) max = grade;
        }

        // 2.
        double sum = 0;
        for (String value : subjects) {
            double grade = Double.parseDouble(value);
            sum += grade / max * 100.0;
        }

        // 3.
        bw.write((sum / subject) + "");

        bw.close();
        br.close();
    }
}
