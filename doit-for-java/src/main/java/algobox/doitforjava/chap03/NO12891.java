package algobox.doitforjava.chap03;

import java.io.*;
import java.util.Arrays;

public class NO12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] length = br.readLine().split(" "); // 9 8
        String given = br.readLine();                     // CCTGGATTG
        int[] acgt = convertArrayStringToInt(br.readLine().split(" "));   // minimum ACGT

        int dna = Integer.parseInt(length[0]);
        int part = Integer.parseInt(length[1]);

        int[] status = new int[4];

        int count = 0;

        for (int i = 0; i < part; i++) {
            char ch = given.charAt(i);
            if(ch == 'A') status[0]++;
            if(ch == 'C') status[1]++;
            if(ch == 'G') status[2]++;
            if(ch == 'T') status[3]++;
        }

//        System.out.println(Arrays.toString(status));
//        System.out.println(Arrays.toString(acgt));

        if(minimumCheck(status, acgt)) {
            count++;
        }

        for (int i = part; i < dna; i++) { // 2 ~ 4

            char prev = given.charAt(i - part);
            if(prev == 'A') status[0]--;
            if(prev == 'C') status[1]--;
            if(prev == 'G') status[2]--;
            if(prev == 'T') status[3]--;

            char next = given.charAt(i);
            if(next == 'A') status[0]++;
            if(next == 'C') status[1]++;
            if(next == 'G') status[2]++;
            if(next == 'T') status[3]++;

            if(minimumCheck(status, acgt)) {
                count++;
            }
        }
        bw.write(count + "");

        bw.close();
        br.close();
    }

    private static boolean minimumCheck(int[] status, int[] acgt) {
        for (int i = 0; i < 4; i++) {
            if(acgt[i] > status[i]) { // 최소를 만족하지 못하면
                return false;
            }
        }
        return true;
    }

    private static int[] convertArrayStringToInt(String[] arr) {
        return Arrays.stream(arr).mapToInt(s -> Integer.parseInt(s)).toArray();
    }
}