import java.util.Arrays;

/**
 * 배열 두배 만들기
 */
public class doubleArr {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4 ,5};
        int[] result = solution(numbers);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] numbers) {
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        
        return numbers;
    }
}