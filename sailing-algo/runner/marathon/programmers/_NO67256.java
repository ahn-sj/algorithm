package programmers;

public class _NO67256 {
    public static void main(String[] args) {
        _NO67256 no67256 = new _NO67256();

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        no67256.solution(numbers, hand);
    }

    public String solution(int[] numbers, String hand) {
        int lloc = 0;
        int rloc = 0;

        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 2 || numbers[i] == 0) {
                if(lloc > rloc) {
                    answer += "L";
                    // i가 3이고 numbers가 5일 때 에러남
                    lloc = i % 3;
                } else if(lloc < rloc) {
                    answer += "R";
                    rloc = i % 3;
                } else if(lloc == rloc){ // lloc == rloc
                    if(hand.equals("left")) {
                        answer += "L";
                    } else if (hand.equals("right")){
                        answer += "R";
                    }
                }

            } else if(numbers[i] % 3 == 1) {
                answer += "L";
                lloc = i % 3;
            } else if (numbers[i] % 3 == 0) {
                answer += "R";
                rloc = i % 3;
            }
            System.out.println(answer);
        }

        return answer;
    }
}
