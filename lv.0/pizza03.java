/**
 * 피자 나눠 먹기 (3)
 */
public class pizza {
    
    public static void main(String[] args) {
        int result = solution(4, 12);

        System.out.println(result);
    }

    private static int solution(int slice, int n) {
        
        return n / slice + (n % slice == 0 ? 0 : 1);
    }
}
