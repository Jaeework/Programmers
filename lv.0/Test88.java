import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 공백으로 구분하기 1
 */
public class Test88 {
    
    public static void main(String[] args) {
        String my_string = "i love you";

        String[] result = solution02(my_string);
        System.out.println(Arrays.toString(result));
    }


    private static String[] solution02(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }

    

    private static String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string, " ");

        String[] answer = new String[st.countTokens()];
        int idx = 0;
        while(st.hasMoreTokens()) {
            answer[idx++] = st.nextToken();
        }

        return answer;
    }
}
