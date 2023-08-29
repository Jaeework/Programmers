/**
 * 부분 문자열
 */
public class Test101 {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabcc";

        int result = solution(str1, str2);
        System.out.println(result);
    }

    private static int solution(String str1, String str2) {
        int answer = (str2.contains(str1)) ? 1 : 0;
        return answer;
    }

}