/**
 * 접두사인지 확인하기
 */
public class Test91 {
    
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";

        int result = solution(my_string, is_prefix);
        System.out.println(result);
    }

    private static int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}
