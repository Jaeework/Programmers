/**
 * 문자열을 정수로 변환하기
 */
public class Test93 {

    public static void main(String[] args) {
        String n_str = "10";
        
        int result = solution(n_str);
        System.out.println(result);
    }

    private static int solution(String n_str) {
        
        return Integer.valueOf(n_str);
    }
    
}
