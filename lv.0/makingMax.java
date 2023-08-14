import java.util.Arrays;

/**
 * 최댓값 만들기 (1)
 */
public class MakingMax {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = solution(numbers);

        System.out.println(result);
    }

    private static int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
    
}
