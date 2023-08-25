/**
 * 세균 증식
 */
public class SquareNum02 {
    
    public static void main(String[] args) {
        int n = 7;
        int t = 15;

        int result = solution(n, t);
        System.out.println(result);
    }

    private static int solution(int n, int t) {

        return n * (int)Math.pow(2, t);
    }
}
