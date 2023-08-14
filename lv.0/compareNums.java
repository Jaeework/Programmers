/**
 * 두 수의 연산값 비교하기
 */
public class CompareNums {

    public static void main(String[] args) {
        int result = solution(91, 2);
        System.out.println(result);
    }

    private static int solution(int a, int b) {
        
        return Math.max(Integer.parseInt("" + a + b), 2*a*b);
    }

}