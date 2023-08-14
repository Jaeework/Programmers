import java.util.Arrays;

/**
 * 짝수 홀수 개수
 */
public class EvenOdd03 {

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = solution(num_list);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list) {
        int evenCnt = 0;
        int oddCnt = 0;

        for(int num : num_list) {
            if(num % 2 == 0) {evenCnt++;}
            else {oddCnt++;}
        }


        return new int[]{evenCnt, oddCnt};
    }
    
}
