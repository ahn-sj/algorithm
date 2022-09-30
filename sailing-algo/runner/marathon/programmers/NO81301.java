package programmers;

public class NO81301 {
    public static void main(String[] args) {
        NO81301 no81301 = new NO81301();

        int s = no81301.solution("one4seveneight");
        System.out.println("s = " + s);

    }

    public int solution(String s) {
        String[] intArr = {"0","1","2","3","4","5","6","7","8","9"};
        String[] engArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < engArr.length; i++) {
            s = s.replace(engArr[i], intArr[i]);
        }

        int answer = Integer.parseInt(s);

        return answer;
    }

}
