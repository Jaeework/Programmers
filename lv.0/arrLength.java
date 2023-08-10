import java.util.Arrays;

/**
 * 배열 원소의 길이
 */
public class arrLength {
    
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        int[] result = solution(strlist);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}
