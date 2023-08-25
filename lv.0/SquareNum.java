/**
 * 제곱수 판별하기
 */
public class SquareNum {
    
    public static void main(String[] args) {
        int n = 976;
        int result = solution(n);

        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 2;
        int temp = (int)Math.sqrt(n);
        if(temp * temp == n) {answer = 1;}
        
        return answer;
    }
}
