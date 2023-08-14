/**
 * 문자 반복 출력하기
 */
public class RepeatLetter {

    public static void main(String[] args) {
        String result = solution("hello", 3);
        System.out.println(result);
    }

    private static String solution(String my_string, int n) {
        String answer = "";

        for(char ch : my_string.toCharArray()) {
            answer += ("" + ch).repeat(n);
            /*for(int i = 0; i < n; i++) {
                answer += ch;
            }*/
        }

        return answer;
    }
    
}
