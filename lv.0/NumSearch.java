/**
 * 정수 찾기
 */
public class NumSearch {
    
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;

        int result = solution(num_list, n);
        System.out.println(result);
    }

    private static int solution(int[] num_list, int n) {
        int answer = 0;

        for(int num : num_list) {
            if(num == n) {answer = 1;}
        }
        
        return answer;
    }
}
