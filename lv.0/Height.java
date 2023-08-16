/**
 * 머쓱이보다 키 큰 사람
 */
public class Height {

    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        int height = 167;

        int result = solution(array, height);
        System.out.println(result);
    }

    private static int solution(int[] array, int height) {
        int answer = 0;

        for(int h : array) {
            if(h > height) {answer++;}
        }

        return answer;
    }
    
}
