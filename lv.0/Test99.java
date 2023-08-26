/**
 * 특정한 문자를 대문자로 바꾸기
 */
public class Test99 {

    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";

        String result = solution(my_string, alp);
        System.out.println(result);
    }

    private static String solution(String my_string, String alp) {
        String answer = my_string.replace(alp, alp.toUpperCase());
        
        return answer;
    }
    
}
