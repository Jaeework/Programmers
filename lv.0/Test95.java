/**
 * 첫 번쨰로 나오는 음수
 */
public class Test95 {

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        
        int result = solution(num_list);
        System.out.println(result);
        
    }

    private static int solution(int[] num_list) {
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) {return i;}
        }

        return -1;
    }
    
}
