import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 주사위 게임 3
 */
public class dice03 {
    
    public static void main(String[] args) {
        int result = solution(2, 2, 2, 2);

        System.out.println(result);
    }

    private static int solution(int a, int b, int c, int d) {
        int answer = 0;

        Set<Integer> diceSet = new HashSet<Integer>(Arrays.asList(new Integer[]{a, b, c, d}));

        int setSize = diceSet.size();

        if(setSize == 1) {
            answer = 1111 * a;
        } else if(setSize == 2) {
        }

        return answer;
    }

}
