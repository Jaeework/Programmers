/**
 * 더 크게 합치기
 */
public class BiggerInt {
    
    public static void main(String[] args) {
        int result = solution(89, 8);

        System.out.println(result);
    }

    private static int solution(int a, int b) {
        int answer = 0;

        int n01 = Integer.valueOf("" + a + b);
        int n02 = Integer.valueOf("" + b + a);

        answer = (n01 >= n02) ? n01 : n02;


        return answer;
    }
}
