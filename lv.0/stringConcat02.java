/**
 * 글자 이어 붙여 문자열 만들기
 */
public class StringConcat02 {
    
    public static void main(String[] args) {
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String result = solution("cvsgiorszzzmrpaqpe", index_list);

        System.out.println(result);
    }

    private static String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int idx : index_list) {
            answer += my_string.charAt(idx);
        }

        return answer;
    }
}
