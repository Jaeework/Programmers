/**
 * 짝수의 합
 */
public class evenAddition {
    
    public static void main(String[] args) {
        int result = solution(10);

        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 0;

        while(n > 0) {
            if(n % 2 == 0) {
                answer += n;
            }

            n -= 1;
        }
        
        return answer;
    }
}
