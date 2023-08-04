import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 주사위 게임 2
 */
public class dice02 {

    public static void main(String[] args) {
        int result = solution(2, 6, 1);

        System.out.println(result);
    }

    private static int solution(int a, int b, int c) {

        Set<Integer> diceSet = new HashSet<Integer>(Arrays.asList(a, b, c));

        double answer = diceSet.size() == 3 ? a + b + c : 
                        (diceSet.size() == 2 ? (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) : 
                        (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));


        return (int)answer;
    }

    // a == b && b == c, a == b || a ==c || b ==c 이용해서 풀어보기
    
}
