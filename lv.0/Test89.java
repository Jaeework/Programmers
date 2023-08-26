import java.util.Arrays;

/**
 * n개 간격의 원소들
 */
public class Test89 {
    
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 4;

        int[] result = solution(num_list, n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length % n == 0) ? num_list.length / n : num_list.length / n + 1];
        System.out.println(answer.length);

        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list[n * i];
        }
        return answer;
    }
}
