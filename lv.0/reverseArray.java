import java.util.Arrays;

/**
 * 배열 뒤집기
 */
public class reverseArray {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = solution(num_list);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }

        return answer;
    }

}
