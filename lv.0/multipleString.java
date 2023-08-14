/**
 * 문자열 곱하기
 */
public class MultipleString {

    public static void main(String[] args) {
        String answer = solution("string", 3);
        
        System.out.println(answer);
    }

    private static String solution(String str, int k) {
        String answer = "";

        answer += str.repeat(k);

        return answer;
    }
    
}
