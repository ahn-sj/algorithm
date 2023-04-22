package algobox.doitforjava.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NO2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int tmp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        for (int num : nums) System.out.println(num);

        br.close();
    }
}
