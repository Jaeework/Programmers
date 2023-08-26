import java.util.Arrays;

/**
 * 조건에 맞게 수열 변환하기 1
 */
public class Test94 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 88};

        int[] result = solution(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr) {
        int[] answer = arr.clone();

        for(int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            boolean isOverFifty = temp >= 50 && temp % 2 == 0;
            boolean isUnderFifty = temp < 50 && temp % 2 != 0;
            if(isOverFifty) {answer[i] = temp / 2;}
            else if(isUnderFifty) {answer[i] = temp * 2;}
        }

        return answer;
    }
    
}
