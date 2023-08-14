/**
 * 이어 붙인 수
 */
public class LinkedNum {
    
    public static void main(String[] args) {
        int[] num_list = new int[]{3, 4, 5, 2, 1};
        int result = solution(num_list);

        System.out.println(result);
    }

    private static int solution(int[] num_list) {

        String evenString = "";
        String oddString = "";

        for(int num : num_list) {
            if(num % 2 == 0) {
                evenString += "" + num;
            } else {
                oddString += "" + num;
            }
        }

        int even = Integer.valueOf(evenString);
        int odd = Integer.valueOf(oddString);

        return even + odd;
    }
}
