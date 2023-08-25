import java.util.Arrays;

/**
 * 짝수는 싫어요
 */
public class OddArr {
    
    public static void main(String[] args) {
        int n = 10;
        int[] result = solution(n);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int n) {
        int[] answer = new int[(n % 2 == 0) ? n / 2 : n / 2 + 1];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = 2 * i + 1;
        }

        return answer;
    }
}
