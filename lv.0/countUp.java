import java.util.Arrays;

/**
 * 카운트 업
 */
public class CountUp {
    
    public static void main(String[] args) {
        int[] result = solution(3, 10);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = start + i;
        }

        return answer;
    }
}
