/**
 * 수 조작하기 2
 */
public class ManipulateNum02 {
    
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String result = solution(numLog);

        System.out.println(result);
        
    }

    private static String solution(int[] numLog) {
        String answer = "";

        for(int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            switch(diff) {
                case 1 : 
                    answer += "w";
                    break;
                case -1 : 
                    answer += "s";
                    break;
                case 10 :
                    answer += "d";
                    break;
                case -10 :
                    answer += "a";
                    break;
            }
        }

        return answer;
    }

    
}
