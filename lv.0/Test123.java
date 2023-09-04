/*
 * 할 일 목록
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test123 {
    
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        String[] result = solution(todo_list, finished);
        System.out.println(Arrays.toString(result));
    }

    private static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};

        List<String> arrList = new ArrayList<String>();

        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {arrList.add(todo_list[i]);}
        }

        answer = arrList.toArray(new String[arrList.size()]);
        
        return answer;
    }
}
