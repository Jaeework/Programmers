import java.util.Arrays;

/**
 * 아이스 아메리카노
 */
public class IceAmericano {

    public static void main(String[] args) {
        int money = 5500;
        int[] result = solution(money);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }
    
}
