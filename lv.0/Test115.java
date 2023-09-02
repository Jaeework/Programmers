/*
 * 홀수 vs 짝수
 */
public class Test115 {

    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};

        int result = solution(num_list);
        System.out.println(result);
    }

    private static int solution(int[] num_list) {
        int answer = 0;

        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                oddSum += num_list[i];
            } else {
                evenSum += num_list[i];
            }
        }

        answer = Math.max(oddSum, evenSum);

        return answer;
    }
    
}
