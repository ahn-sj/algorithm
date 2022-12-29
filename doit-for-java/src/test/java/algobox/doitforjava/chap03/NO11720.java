package algobox.doitforjava.chap03;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

// split 말고 toCharArray로 characher 배열로도 풀어보기
public class NO11720 {

    @Test
    public void Test() throws Exception {
        String max = "25";
        String given = "7000000000000000000000000";

        assertEquals(solution(max, given), new Long(7));
    }

    public Long solution(String max, String given) {
        long answer = 0;

        String[] split = given.split("");

        for (String s : split) {
            answer += Long.valueOf(s);
        }

        return answer;
    }
}
