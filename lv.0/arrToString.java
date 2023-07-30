/**
 * 문자 리스트를 문자열로 변환하기
 */
public class arrToString {

    public static void main(String[] args) {
        arrToString as = new arrToString();
        
        String[] arr = {"a", "b", "c"};
        
        String answer = as.solution(arr);
        
        System.out.println(answer);
    }
    
    public String solution(String[] arr) {
        String answer = "";

        /*
        for(String s : arr) {
            answer += s;
        }
        */

        answer = String.join("", arr);

        return answer;
    }
}
