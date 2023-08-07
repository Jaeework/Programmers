import java.util.Arrays;

/**
 * 수열과 구간 쿼리 2
 */
public class query02 {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        int[] result = solution(arr, queries);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int min = 1000000;
            boolean hasAnaswer = false;
            
            for(int j = 0; j < arr.length; j++) {
                int temp = arr[j];
                if(j >= query[0] && j <= query[1] 
                && temp > query[2] && temp <= min) {
                    min = temp;
                    hasAnaswer = true;
                }
            }

            answer[i] = (hasAnaswer) ? min : -1;
        }

        return answer;
    }
}
