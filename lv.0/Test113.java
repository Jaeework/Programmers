/*
 * l로 바꾸기
 */
public class Test113 {
    
    public static void main(String[] args) {
        String myString = "abcdevwxyz";

        String result = solution(myString);
        System.out.println(result);
    }

    private static String solution(String myString) {
        String answer = "";
        
        for(char ch : myString.toCharArray()) {
            if(ch - 'l' < 0) {ch = 'l';}
            answer += ch;
        }

        return answer;
    }
}
