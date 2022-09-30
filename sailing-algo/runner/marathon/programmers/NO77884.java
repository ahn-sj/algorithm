package programmers;

public class NO77884 {
    public static void main(String[] args) {

    }
    public int solution(int left, int right) {

        int calc = 0;

        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }

            if(cnt % 2 == 0) {
                calc += i;
            } else if(cnt % 2 == 1) {
                calc -= i;
            }
        }
        int answer = calc;
        return answer;
    }
}
