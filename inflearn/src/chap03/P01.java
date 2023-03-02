package chap03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 두 배열 합치기
 */
public class P01 {
    public static void main(String[] args) throws IOException {
        List<Integer> answer = new ArrayList<>();
        int pointerA = 0, pointerB = 0;

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

        while (pointerA < sizeA && pointerB < sizeB) {
            if(A[pointerA] < B[pointerB]) {
                answer.add(A[pointerA++]);
            } else if(A[pointerA] >= B[pointerB]) {
                answer.add(B[pointerB++]);
            }
        }

        while (pointerA < sizeA) {
            answer.add(A[pointerA++]);
        }
        while (pointerB < sizeB) {
            answer.add(B[pointerB++]);
        }

        System.out.println("answer = " + answer);

        br.close();
    }
}
