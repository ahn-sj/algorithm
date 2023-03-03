package chap06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 이분 검색 (Binary Search)
 */
public class P08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int[] given = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(given);

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int lt = 0;
        int rt = n - 1;

        int index = 0;

        while (true) {
            // lt <= rt
            int mid = (int) Math.floor((lt + rt) / 2);

            if(given[mid] == m) {
                index = mid + 1;
                break;
            }
            if(given[mid] < m) lt = mid + 1;
            else rt = mid - 1;

            if(lt > rt) {
                break;
            }
        }
        System.out.println(index);
    }
}
