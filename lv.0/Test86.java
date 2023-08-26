/**
 * 문자열의 뒤의 n글자
 */
public class Test86 {
    
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;

        String result = solution(my_string, n);
        System.out.println(result);
    }

    private static String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length() - n);
        return answer;
    }
}
