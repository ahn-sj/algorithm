package programmers;

public class NO12977 {
    public static void main(String[] args) {


        NO12977 no12977 = new NO12977();

        int[] arr = {1,2,3,4};

        no12977.solution(arr);
    }

    public int solution(int[] nums) {

        int answer = 0;

//        int max = nums[nums.length - 1];
//        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 2; k < nums.length; k++) {
                    if(isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }
//        System.out.println(answer);
        return answer;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
