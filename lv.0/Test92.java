import java.util.Arrays;

/**
 * 카운트 다운
 */
public class Test92 {
    
    public static void main(String[] args) {
        int start_num = 10;
        int end_num = 3;

        int[] result = solution(start_num, end_num);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        for(int i = start_num, idx = 0; i >= end_num; i--) {
            answer[idx++] = i;
        }
        return answer;
    }

}
