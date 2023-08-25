/**
 * 숨어있는 숫자의 덧셈 (1)
 */
public class Sum01 {
    
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int result = solution(my_string);

        System.out.println(result);
    }

    private static int solution(String my_string) {
        int answer = 0;

        for(char ch : my_string.toCharArray()) {
            if(Character.isDigit(ch)) {
                answer += Integer.valueOf(String.valueOf(ch));
            }
        } 

        return answer;
    }
    
}
