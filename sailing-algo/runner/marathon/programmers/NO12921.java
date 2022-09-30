package programmers;

public class NO12921 {
    public static void main(String[] args) {

    }

    public int solution(int n) {
        boolean[] booleans = new boolean[n + 1];

        booleans[0] = booleans[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if(!booleans[i]){
                for (int j = i * i; j <= n; j+=i) {
                    booleans[j] = true;
                }
            }
        }

        int answer = 0;
        for (boolean bool : booleans) {
            if(!bool) {
                answer++;
            }
        }
        return answer;
    }

    /*
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 2; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt == 1) {
                answer++;
            }
        }

        return answer;
    }

     */

}
