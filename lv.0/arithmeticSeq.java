/**
 * 등차수열의 특정한 항만 더하기
 */
public class arithmeticSeq {

    public static void main(String[] args) {
        boolean[] included = {true, false, false, true, true};
        int result = solution(3, 4, included);

        System.out.println(result);
    }

    private static int solution(int a, int d, boolean[] included) {
        
        int result = 0;

        for(int i = 0; i < included.length; i++) {
            if(included[i]) {
                result += a + i * d;
            }
        }
        
        return result;
    }
    
}
