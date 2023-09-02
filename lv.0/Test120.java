import java.util.Arrays;

/**
 * 5명씩
 */
public class Test120 {
    
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        String[] result = solution(names);
        System.out.println(Arrays.toString(result));
    }

    private static String[] solution(String[] names) {
        String[] answer = new String[(names.length % 5 == 0) ? names.length / 5 : names.length / 5 + 1];

        for(int i = 0, idx = 0; i < names.length; i += 5, idx++) {
            answer[idx] = names[i];
        }

        return answer;
    }
}
