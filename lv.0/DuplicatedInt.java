/**
 * 중복된 숫자 개수
 */
public class DuplicatedInt {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;

        int result = solution(array, n);
        System.out.println(result);
    }

    private static int solution(int[] array, int n) {
        int answer = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {answer++;}
        }
        
        return answer;
    }
    
}
