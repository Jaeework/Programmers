import java.util.Arrays;

/**
 * 마지막 두 원소
 */
public class lastElement {
    
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] result = solution02(num_list);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution02(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        int last = num_list[num_list.length - 1];
        int prevL = num_list[num_list.length - 2];

        answer[answer.length - 1] = last - prevL > 0 ? last - prevL : last * 2;

        return answer;
    }


    private static int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        int lastE = num_list[num_list.length - 1];
        int scndLE = num_list[num_list.length - 2];

        boolean isLastBigger = lastE - scndLE > 0;

        answer[answer.length - 1] = isLastBigger ? lastE - scndLE : lastE * 2;

        return answer;
    }
}
