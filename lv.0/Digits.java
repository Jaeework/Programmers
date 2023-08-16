/**
 * 자릿수 더하기
 */
public class Digits {
    
    public static void main(String[] args) {
        int n = 930211;

        int result = solution(n);
        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 0;

        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }
}
