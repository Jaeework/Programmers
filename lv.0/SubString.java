/**
 * 문자열의 앞의 n글자
 */
public class SubString {
    
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;

        String result = solution(my_string, n);
        System.out.println(result);
    }

    private static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
