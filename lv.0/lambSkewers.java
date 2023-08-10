/**
 * 양꼬치
 */
public class lambSkewers {

    public static void main(String[] args) {
        int result = solution(64, 6);

        System.out.println(result);
    }

    private static int solution(int n, int k) {
        int answer = 0;

        // 양꼬치 가격
        answer += n * 12000;

        // 음료수
        answer += (k - n / 10) * 2000;

        return answer;
    }
    
}
