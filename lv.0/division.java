/**
 * 두 수의 나눗셈
 */
public class Division {
    
    public static void main(String[] args) {
        int result = solution(7, 3);

        System.out.println(result);
    }

    private static int solution(int num1, int num2) {
        return (int)(num1 / (double)num2 * 1000);
    }
}
