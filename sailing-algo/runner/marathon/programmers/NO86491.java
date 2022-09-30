package programmers;

public class NO86491 {

    public int solution(int[][] sizes) {

        int max = 0;
        int min = 0;

        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                max = Math.max(sizes[i][0], max);
                min = Math.max(sizes[i][1], min);
            } else {
                max = Math.max(sizes[i][1], max);
                min = Math.max(sizes[i][0], min);
            }
        }
//        System.out.println(max + ", " + min);

        int answer = max * min;
        return answer;
    }

    public static void main(String[] args) {

    }
}
