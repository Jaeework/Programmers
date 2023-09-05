/*
 * n의 배수 고르기
 */

import java.util.Arrays;

public class Test124 {
    
    public static void main(String[] args) {
        int n = 12;
        int[] numlist = {2, 100, 120, 600, 12, 12};

        int[] result = solution(n, numlist);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int n, int[] numlist) {
        int[] answer = {};

        int cnt = 0;

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                cnt++;
            }
        }
        answer = new int[cnt];

        int idx = 0;

        for(int num : numlist) {
            if(num % n == 0) {answer[idx++] = num;}
        }

        return answer;
    }
}
