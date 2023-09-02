/*
 * 배열의 원소 삭제하기
 */

import java.util.Arrays;

public class Test119 {
   
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        int[] result = solution(arr, delete_list);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};

        int cnt = arr.length;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {arr[i] = 0;}
            }

            if(arr[i] == 0) {cnt--;}
        }

        answer = new int[cnt];

        int idx = 0;
        for(int num : arr) {
            if(num != 0) {
                answer[idx++] = num;
            }
        }

        return answer;
    }
}
