/**
 * 9로 나눈 나머지
 */
public class Remainder {
    
    public static void main(String[] args) {
        int result = solution("78720646226947352489");

        System.out.println(result);
    }

    private static int solution(String number) {
        int sum = 0;

        for(char ch : number.toCharArray()) {
            sum += Character.getNumericValue(ch);
        }
        int answer = sum % 9;

        return answer;
    }
}
