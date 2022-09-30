package programmers;

import java.util.Arrays;

public class __NO42576 {
    public static void main(String[] args) {
        __NO42576 no42576 = new __NO42576();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        no42576.solution(participant, completion);
    }

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);


        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                break;
            }
        }
        String answer = participant[i];
        return answer;
    }

    /*
    public String solution(String[] participant, String[] completion) {

        boolean[] chk = new boolean[participant.length];

        for(int i = 0; i < completion.length; i++) {
            for(int j = 0; j < participant.length; j++) {
                if(completion[i].equals(participant[j])) {
                    chk[j] = true;
                    break;
                }
            }
        }

        String answer = "";

        for(int i = 0; i < chk.length; i++) {
            if(!chk[i]) {
                answer = participant[i];
                break;
            }
        }
        return answer;
    }

     */
}
