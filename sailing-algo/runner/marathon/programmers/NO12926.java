package programmers;

public class NO12926 {
    public static void main(String[] args) {
        NO12926 no12926 = new NO12926();
        no12926.solution("a B z", 4);
    }

    public String solution(String s, int n) {

        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' ') {
                answer += " ";
                continue;
            }

            if(Character.isLowerCase(c)) {
                // 소문자
                if(c + n > 122) {
                    System.out.println("Character.isLowerCase(c) >" + ((c + n) - 26));
                    c = (char) ((c + n) - 26);

                } else {
                    c = (char) (c + n);
                }
            } else if(Character.isUpperCase(c)) {
                // 대문자
                if(c + n > 90) {
                    c = (char) ((c + n) - 26);
                    System.out.println("Character.isUpperCase(c) >" + c);
                } else {
                    c = (char) (c + n);
                }
            }
            answer += c;
        }
        return answer;
    }
}
