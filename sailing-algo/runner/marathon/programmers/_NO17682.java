package programmers;

// https://school.programmers.co.kr/questions/10519
// replace
public class _NO17682 {
    public static void main(String[] args) {
        _NO17682 no17682 = new _NO17682();

        no17682.solution("1D2S#10S");
    }

    public int solution(String dartResult) {
        String rdart = dartResult.replaceAll("10", "Z");
        System.out.println(rdart);

        char[] chars = dartResult.toCharArray();

        for (int i = 1; i < chars.length; i++) {
            // case: 'S'
            if(chars[i] == 'S') {
//                if(chars)
            }
        }

        int answer = 0;
        return answer;
    }
}
