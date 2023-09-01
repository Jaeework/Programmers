/**
 * 부분 문자열인지 확인하기
 */
public class Test104 {

    public static void main(String[] args) {
        String my_string = "banana";
        String target = "ana";

        int result = solution(my_string, target);
        System.out.println(result);
    }

    private static int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)){answer = 1;}
        return answer;
    }
    
}
