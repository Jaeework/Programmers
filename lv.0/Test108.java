/*
 * 접미사인지 확인하기
 */
public class Test108 {
    
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";

        int result = solution(my_string, is_suffix);
        System.out.println(result);
    }

    private static int solution(String my_string, String is_suffix) {
        int answer = 0;

        if(my_string.endsWith(is_suffix)) {answer = 1;}
        
        return answer;
    }
}
