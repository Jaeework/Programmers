/**
 * 공배수
 */
public class commonMul {
    
    public static void main(String[] args) {
        int result = solution(60, 2, 3);
        System.out.println(result);
    }

    private static int solution(int number, int n, int m) {
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}
