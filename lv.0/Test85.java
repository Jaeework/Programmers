import java.util.Arrays;

/**
 * 조건에 맞게 수열 변환하기 3
 */
public class Test85 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;

        int[] result = solution(arr, k);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr, int k) {
        boolean isEven = k % 2 == 0;
        for(int i = 0; i < arr.length; i++) {
            if(isEven) {
                arr[i] = arr[i] + k;
            } else {
                arr[i] = arr[i] *k;
            }
        }

        return arr;
    }
    
}
