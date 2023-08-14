/**
 * 숫자 비교하기
 */
public class CompareNums02 {
    
    public static void main(String[] args) {
        int result = solution(2, 3);
        System.out.println(result);    
    }

    private static int solution(int num1, int num2) {
        
        return (num1 == num2) ? 1 : -1;
    }


}
