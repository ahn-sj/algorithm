package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NO64061 {
    public static void main(String[] args) {
        NO64061 no64061 = new NO64061();

        int[][] deepArr = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };

        int[] movArr = {1,5,3,5,1,2,1,4};

        no64061.solution(deepArr, movArr);
    }

    public int solution(int[][] board, int[] moves) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            int moved = moves[i] - 1;

            for (int j = 0; j < board[0].length; j++) {
                if(board[j][moved] != 0) {
                    list.add(board[j][moved]);
                    board[j][moved] = 0;
                    break;
                }
            }
        }

        int rstCnt = 0;
        int stored = -1;
        // 333이 온 경우
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i);

            if(stored == tmp) {
                list.remove(i - 1);
                list.remove(i - 1);

                rstCnt = rstCnt + 2;
                stored = -1;

                i = -1;
                continue;
            }
            stored = tmp;
        }

        for (Integer integer : list) {
            System.out.print(integer + ",");

        }

        int answer = rstCnt;

        System.out.println("\nanswer = " + answer);
        return answer;
    }
}
