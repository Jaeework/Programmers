/**
 * 길이에 따른 연산
 */
public class ArrOperation {
    
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int result = solution(num_list);

        System.out.println(result);
    }

    private static int solution(int[] num_list) {
        int answer = num_list.length >= 11 ? 0 : 1;

        if(answer == 1) {
            for(int num : num_list) {
                answer *= num;
            }
        } else {
            for(int num : num_list) {
                answer += num;
            }
        }
        
        return answer;
    }
}
