import java.util.Arrays;

/**
 * 뒤에서 5등 위로
 */
public class Test102 {
    
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        
        int[] result = solution(num_list);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];

        Arrays.sort(num_list);
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i + 5];
        }

        return answer;
    }
}
