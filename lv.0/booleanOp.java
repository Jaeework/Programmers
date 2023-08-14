/**
 * 간단한 논리 연산
 */
public class BooleanOp {
    
    public static void main(String[] args) {
        boolean result = solution(true, false, false, false);

        System.out.println(result);
    }

    private static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 || x2) && (x3 || x4);
              
        return answer;
    }

}
