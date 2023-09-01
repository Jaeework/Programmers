/**
 * 꼬리 문자열
 */
public class Test107 {
    
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";

        String result = solution(str_list, ex);
        System.out.println(result);
    }

    private static String solution(String[] str_list, String ex) {
        String answer = "";

        for(String str : str_list) {
            if(!str.contains(ex)) {answer += str;}
        }

        return answer;
    }
}
