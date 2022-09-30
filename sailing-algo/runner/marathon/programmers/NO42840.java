package programmers;

public class NO42840 {
    public static void main(String[] args) {

        NO42840 no42840 = new NO42840();

        int[] answer = {1,2,3,4,5};

        no42840.solution(answer);

    }

    public int[] solution(int[] answers) {

        int[][] supo = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] curr = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            // supor1
            if(answers[i] == supo[0][i % 5]) {
                curr[0]++;
            }

            if(answers[i] == supo[1][i % 8]) {
                curr[1]++;
            }

            if(answers[i] == supo[2][i % 10]) {
                curr[2]++;
            }
        }

        int max=0;
        int result_cnt=0;

        for(int i=0;i<3;i++){
            if( curr[i]>=max )
                max=curr[i];
        }

        for(int i=0;i<3;i++){
            if( curr[i]==max )
                result_cnt+=1;
        }

        int answer[] = new int[result_cnt];

        result_cnt=0;
        for(int i=0;i<3;i++){
            if( curr[i]==max )
                answer[result_cnt++]=i+1;
        }
        return answer;
    }
}
