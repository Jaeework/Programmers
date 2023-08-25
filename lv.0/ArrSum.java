/**
 * n보다 커질 때까지 더하기
 */
public class ArrSum {

    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;

        int result = solution(numbers, n);
        System.out.println(result);
    }

    private static int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i = 0; answer <= n && i < numbers.length; i++) {
            answer += numbers[i];
        }
        
        return answer;
    }
    
}
