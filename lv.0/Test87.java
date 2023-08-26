import java.util.Arrays;

/**
 * 배열 만들기 1
 */
public class Test87 {
    
    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        int[] result = solution(n, k);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for(int i = 1, idx = 0; i <= n; i++) {
            if(i % k == 0) {
                answer[idx++] = i;
            }
        }
        return answer;
    }
}
