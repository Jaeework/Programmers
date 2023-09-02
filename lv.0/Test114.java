/*
 * 0 떼기
*/
public class Test114 {

    public static void main(String[] args) {
        String n_str = "0010";

        String result = solution01(n_str);
        System.out.println(result);
    }

    private static String solution01(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }

    private static String solution(String n_str) {
        String answer = "";
        
        if(n_str.startsWith("0")) {
            for(int i = 1; i < n_str.length(); i++) {
                if(n_str.charAt(i) != '0') {
                    answer = n_str.substring(i);
                    break;
                }
            }
        }     
        else {answer = n_str;}
        
        return answer;
    }
    
    
}
