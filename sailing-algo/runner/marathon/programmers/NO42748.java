package programmers;

import java.util.Arrays;

public class NO42748 {
    public static void main(String[] args) {

        NO42748 no42748 = new NO42748();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4,4,1},
                {1,7,3}
        };

        no42748.solution(array, commands);
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];

            int[] ints = Arrays.copyOfRange(array, start - 1, end);

            Arrays.sort(ints);
            answer[i] = ints[index - 1];
        }
        return answer;
    }
}
