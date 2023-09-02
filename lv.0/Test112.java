/*
 * 원하는 문자열 찾기
 */
public class Test112 {
    
    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";

        int result = solution(myString, pat);
        System.out.println(result);
    }

    private static int solution(String myString, String pat) {
        int answer = 0;

        if(myString.toUpperCase().contains(pat.toUpperCase())) {answer = 1;}

        return answer;
    }
}
