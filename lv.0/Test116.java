/*
 * 배열의 원소만큼 추가하기
 */

import java.util.Arrays;

public class Test116 {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4};

        int[] result = solution(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr) {
        int[] answer = {};
        
        int cnt = 0;

        for(int num : arr) {
            cnt += num;
        }

        answer = new int[cnt];

        cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer[cnt++] = arr[i];
            }
        }

        return answer;
    }
    
}
