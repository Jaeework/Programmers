/**
 * 문자열 안에 문자열
 */
public class MultiString {
    
    public static void main(String[] args) {
        String str1 = "ppprrrogrammers";
        String str2 = "pppp";

        int result = solution(str1, str2);
        System.out.println(result);
    }

    private static int solution(String str1, String str2) {
        int answer = str1.contains(str2) ? 1 : 2;

        return answer;
    }
}
