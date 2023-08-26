import java.util.Arrays;

/**
 * n 번째 원소까지
 */
public class Test96 {
    
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;

        int[] result = solution(num_list, n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
