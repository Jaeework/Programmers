import java.util.Arrays;

/**
 * n번째 원소부터
 */
public class Test84 {
    
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 3;

        int[] result = solution(num_list, n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        for(int i = n - 1, idx = 0; i < num_list.length; i++, idx++) {
            answer[idx] = num_list[i];
        }

        return answer;
    }
}
