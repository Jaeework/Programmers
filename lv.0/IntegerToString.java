/**
 * 문자열로 변환
 */
public class IntegerToString {
    
    public static void main(String[] args) {
        int n = 123;

        String result = solution(n);
        System.out.println(result);
    }

    private static String solution(int n) {
        return String.valueOf(n);
    }
}
