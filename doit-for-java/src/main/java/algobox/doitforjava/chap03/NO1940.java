package algobox.doitforjava.chap03;

import java.io.*;
import java.util.Arrays;

/**
 * 몇 개의 갑옷을 만들 수 있는가
 */
public class NO1940 {
    /**
     * 투 포인터 방식 2 - 처음과 끝 배열을 가리키는 포인터
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ingredient = Integer.parseInt(br.readLine());
        int need = Integer.parseInt(br.readLine());

        int[] ingredients = Arrays
                .stream(br.readLine().split(" "))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();
        Arrays.sort(ingredients);

        int lp = 0;
        int rp = ingredients.length - 1;

        int count = 0;

        while (lp < rp) {
            if(ingredients[lp] + ingredients[rp] == need) {
                count++;

                lp++;
                rp--;
            } else if(ingredients[lp] + ingredients[rp] > need) {
                rp--;
            } else if(ingredients[lp] + ingredients[rp] < need) {
                lp++;
            }
        }
        bw.write(count + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
