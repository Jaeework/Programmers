/**
 * n의 배수
 */
public class multipleNum {
    
    public static void main(String[] args) {
        int result = solution(98, 2);
        System.out.println(result);
    }

    private static int solution(int num, int n) {

        return (num % n == 0) ? 1 : 0;
    }
}
