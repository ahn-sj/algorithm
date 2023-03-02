package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 공통 원소 구하기
 */
public class P02 {
    public static void main(String[] args) throws IOException {

        List<Integer> answer = new ArrayList<>();
        int pointerA = 0, pointerB = 0;

        StringBuffer sb = new StringBuffer();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sizeA = Integer.parseInt(br.readLine());
        String[] elementA = br.readLine().split(" ");

        int sizeB = Integer.parseInt(br.readLine());
        String[] elementB = br.readLine().split(" ");

        int[] A = new int[sizeA];
        int[] B = new int[sizeB];

        for (int i = 0; i < elementA.length; i++) {
            A[i] = Integer.parseInt(elementA[i]);
        }

        for (int i = 0; i < elementB.length; i++) {
            B[i] = Integer.parseInt(elementB[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B); // 정렬

        while (pointerA < sizeA && pointerB < sizeB) {
            if(A[pointerA] > B[pointerB]) {
                pointerB++;
            } else if (A[pointerA] < B[pointerB]) {
                pointerA++;
            } else if(A[pointerA] == B[pointerB]) {
                answer.add(A[pointerA++]);
            }
        }

        for (Integer integer : answer) {
            sb.append(integer + " ");
        }

        System.out.println(sb);
    }
}
