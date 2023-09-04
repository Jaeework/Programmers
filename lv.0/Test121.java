/*
 *  순서 바꾸기 
 */

import java.util.Arrays;

public class Test121 {

    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;

        int[] result = solution(num_list, n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0; i < num_list.length; i++) {
            if(i > (n - 1)) {
                answer[i - n] = num_list[i];
            } else {
                answer[i + (num_list.length - n)] = num_list[i];
            }
        }

        return answer;
    }
}