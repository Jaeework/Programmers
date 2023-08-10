/**
 * 배열의 평균값
 */
public class average {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = solution(numbers);

        System.out.println(result);
    }

    private static double solution(int[] numbers) {
        double answer = 0;
        
        int sum = 0;

        for(int num : numbers) {
            sum += num;
        }

        answer = (double) sum / numbers.length;

        return answer;
    }
    
}
