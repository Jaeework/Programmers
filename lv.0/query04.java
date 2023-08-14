import java.util.Arrays;

/**
 * 수열과 구간 쿼리 4
 */
public class Query04 {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};

        int[] result = solution(arr, queries);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for(int i = s; i <= e; i++) {
                if(i % k == 0) {arr[i] += 1;}
            }
        }   

        return arr;
    }
}
