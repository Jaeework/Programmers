/**
 * 원소들의 곱과 합
 */
public class multiplyAndSum {

    public static void main(String[] args) {
        int[] num_list = new int[]{3, 4, 5, 2, 1};
        int result = solution(num_list);

        System.out.println(result);
    }

    private static int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        for(int num : num_list) {
            sum += num;
            mul *= num;
        }
        int answer = mul > (int)Math.pow(sum, 2) ? 0 : (mul < (int)Math.pow(sum, 2) ? 1 : null);

        return answer;
    }


    // stream 공부한 후 이용해서 다시 풀어보기

}