package programmers;

import java.util.Arrays;

public class NO17681 {
    public static void main(String[] args) {
        NO17681 no17681 = new NO17681();

        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        no17681.solution(5, arr1, arr2);
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        // n: 한 변의 길이
        // arr1: 지도1
        // arr2: 지도2

        int[][] tArr1 = new int[n][n];
        int[][] tArr2 = new int[n][n];

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int num = tArr1[0].length - 1;
            setMapArray(arr1, tArr1, i, num);

            num = tArr2[0].length - 1;
            setMapArray(arr2, tArr2, i, num);
        }

//        for (int[] ints : tArr1) {
//            System.out.println(Arrays.toString(ints));
//        }
//        System.out.println();
//
//        for (int[] ints : tArr2) {
//            System.out.println(Arrays.toString(ints));
//        }


        for (int i = 0; i < tArr1.length; i++) {
            String str = "";

            for (int j = 0; j < tArr1[0].length; j++) {
                if(tArr1[i][j] == 1 || tArr2[i][j] == 1) {
                    str += '#';
                } else {
                    str += " ";
                }
            }
            answer[i] = str;
        }

//        for (String s : answer) {
//            System.out.println(s);
//        }
        return answer;
    }

    private void setMapArray(int[] arr1, int[][] tArr1, int i, int num) {
        while(true) {
            if(arr1[i] < 1) {
                break;
            }

            tArr1[i][num] = arr1[i] % 2;
            arr1[i] = arr1[i] / 2;
            num--;
        }
    }

}
