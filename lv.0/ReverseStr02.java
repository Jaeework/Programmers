/**
 * 문자열 뒤집기
 */
public class ReverseStr02 {
    
    public static void main(String[] args) {
        String my_string = "jaron";
        String result = solution(my_string);

        System.out.println(result);
    }

    private static String solution(String my_string) {
        String answer = "";

        for(int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
