import java.util.Arrays;

/**
 * 중앙값 구하기
 */
public class Median {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};

        int result = solution(array);
        System.out.println(result);
    }

    private static int solution(int[] array) {
        Arrays.sort(array);

        int answer = array[array.length / 2];
        
        return answer;
    }
}
