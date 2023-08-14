/**
 * 조건 문자열
 */
public class ComparisonOper {
    
    public static void main(String[] args) {
        int result = solution(">", "!", 41, 78);
        System.out.println(result);
    }

    private static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(eq.equals("=")) {
            if(ineq.equals(">")) {
                answer = (n >= m) ? 1 : 0;
            } else {
                answer = (n <= m) ? 1 : 0;
            }
        } else {
            if(ineq.equals(">")) {
                answer = (n > m) ? 1 : 0;
            } else {
                answer = (n < m) ? 1 : 0;
            }
        }

        return answer;        
        
    }
}
