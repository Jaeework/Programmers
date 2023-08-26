/**
 * 문자열 정수의 합
 */
public class Test100 {
    
    public static void main(String[] args) {
        String num_str = "123456789";

        int result = solution(num_str);
        System.out.println(result);
    }

    private static int solution(String num_str) {
        int answer = 0;
        for(String str : num_str.split("")) {
            answer += Integer.parseInt(str);
        }        
        
        return answer;
    }
}
