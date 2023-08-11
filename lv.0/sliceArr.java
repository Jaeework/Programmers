import java.util.Arrays;

/**
 * 배열 자르기
 */
public class sliceArr {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = solution(numbers, 1, 3);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        int idx = 0;
        // for(int i = num1, j = 0, ...) 으로 사용 가능
        for(int i = num1; i <= num2; i++) {
            answer[idx] = numbers[i];
            idx++;
        }

        return answer;
    }
    
}
