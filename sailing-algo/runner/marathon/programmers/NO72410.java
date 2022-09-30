package programmers;

// https://school.programmers.co.kr/questions/33258
public class NO72410 {
    public static void main(String[] args) {
        NO72410 no72410 = new NO72410();

        no72410.solution("=.=");
    }

    public String solution(String new_id) {

        // step 1
        String ruleId = new_id.toLowerCase();

        // step 2
        ruleId = ruleId.replaceAll("[^a-z0-9-_.]", "");

        // step 3
        ruleId = ruleId.replaceAll("\\.{2,}", ".");

        // step 4
        ruleId = ruleId.replaceAll("^[.]|[.]$", "");

        // step 5
        if(ruleId.equals("")) {
            ruleId = "a";
        }

        // step 6
        if(ruleId.length() >= 16) {
            ruleId = ruleId.substring(0,15);
            ruleId = ruleId.replaceAll("[.]$", "");
        }

        // step 7
        if(ruleId.length() < 3) {
            while (ruleId.length() < 3) {
                ruleId += ruleId.charAt(ruleId.length() - 1);
            }
        }
        System.out.println(ruleId);
        String answer = ruleId;
        return answer;
    }
}
