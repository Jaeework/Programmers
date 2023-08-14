import java.util.Arrays;

/**
 * 수열과 구간 쿼리 3
 */
public class Query03 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        int[] result = solution(arr, queries);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr, int[][] queries) {

        for(int[] query : queries) {
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        
        return arr;
    }
    
}
