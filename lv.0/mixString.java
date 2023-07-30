/**
 * 문자열 섞기
 */
public class mixString {

    public static void main(String[] args) {
        mixString ms = new mixString();
        String answer = ms.solution("aaa", "bbb");

        System.out.println(answer);
    }

    public String solution(String str1, String str2) {
        String answer = "";

        for(int i = 0; i < str1.length(); i++) {
            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
        }

        return answer;
    }
    
}
