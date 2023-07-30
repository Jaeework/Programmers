/**
 * 문자열 겹쳐쓰기
 */
public class overwriteString {

    public static void main(String[] args) {
        overwriteString os = new overwriteString();
        String answer = os.solution("He11oWor1d","lloWorl", 2);

        System.out.println(answer);
    }

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s);
        answer += overwrite_string 
               += my_string.substring(s + overwrite_string.length());

        return answer;
    }
    
}
