/*
 * 공백으로 구분하기 2
 */

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test110 {
    
    public static void main(String[] args) {
        String my_string = "i  love you";

        String[] result = solution(my_string);
        System.out.println(Arrays.toString(result));
    }

    private static String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int cnt = st.countTokens();
        String[] answer = new String[cnt];
        
        for(int i = 0; i < cnt; i++) {
            if(st.hasMoreTokens()) {
                answer[i] = st.nextToken();
            }
        }
    
        return answer;
    }
}
