/**
 * 피자 나눠 먹기 (1)
 */
public class pizza01 {
    
    public static void main(String[] args) {
        int result = solution(1);
        System.out.println(result);
    }

    private static int solution(int n) {
        
        return (n % 7 == 0) ? n / 7 : n / 7 + 1;
    }
}
