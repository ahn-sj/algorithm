package programmers;

public class NO12940 {
    public static void main(String[] args) {

    }

    public int[] solution(int n, int m) {

        int gcd = gcd(n, m);
        int lcm = (n * m) / gcd;

        int[] answer = {gcd, lcm};
        return answer;
    }

    private int gcd(int n, int m) {
        if(n % m == 0) {
            return m;
        }
        return gcd(m,n % m);
    }
}

