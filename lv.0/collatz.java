import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 콜라츠 수열
 */
public class collatz {
    
    public static void main(String[] args) {
        int[] result = solution(10);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int n) {
        List<Integer> tmpList = new ArrayList<Integer>();

        while(true) {
            tmpList.add(n);
            if(n == 1) {break;}

            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }

        int[] answer = new int[tmpList.size()];
        for(int i = 0; i < tmpList.size(); i++) {
            answer[i] = tmpList.get(i);
        }

        return answer;
    }
}
