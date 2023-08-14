/**
 * 순서쌍의 개수
 */
public class OrderedPair {
    
    public static void main(String[] args) {
        int result = solution(100);
        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer += 1;
        }
        
        return answer;
    }
}
