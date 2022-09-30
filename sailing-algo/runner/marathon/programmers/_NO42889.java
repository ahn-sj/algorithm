package programmers;

public class _NO42889 {
    public static void main(String[] args) {
        _NO42889 no42889 = new _NO42889();

        // 2, 1, 2, 6, 2, 4, 3, 3
        int[] stages = {4,4,4,4,4};

        no42889.solution(5, stages);
    }

    public int[] solution(int N, int[] stages) {
        double[] player = new double[N + 2];
        double fail = stages.length;

        for (int i = 0; i < stages.length; i++) {
            player[stages[i]] += 1;
        }
        System.out.println("=========");

        for (int i = 0; i < player.length - 2; i++) {
            fail -= player[i];
//            System.out.println("fail = " + fail);
            player[i] = player[i] / fail;
        }

        for (int i = 0; i < player.length; i++) {
            System.out.println("player[" + i + "] = " + player[i]);
        }

        int[] answer = new int[N];

        int cnt = 0;
        double[] tmp = new double[player.length - 2];
        for (int i = 1; i < player.length - 2; i++) {
            tmp[cnt] = player[i];
            cnt++;
        }

        cnt = 0;
        for(int i = 0; i < tmp.length; i++) {
            int index = 0;

            for (int j = 0; j < tmp.length; j++) {
                if(tmp[j] > tmp[index]) {
                    index = j;
                }
            }
//            System.out.println("index = " + index);
            answer[cnt] = index;
            cnt++;

            tmp[index] = -1;
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] += 1;
        }

        for (int i : answer) {
            System.out.print(i + ",");

        }


        return answer;
    }
}
