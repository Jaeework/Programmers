/**
 * flag에 따라 다른 값 반환하기
 */
public class Flag {

    public static void main(String[] args) {
        int result = solution(-4, 7, true);
        System.out.println(result);
    }

    private static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
    
}
