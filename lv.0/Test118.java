/*
 * A 강조하기
 */
public class Test118 {
    
    public static void main(String[] args) {
        String myString = "abstract algebra";

        String result = solution(myString);
        System.out.println(result);
    }

    private static String solution(String myString) {
        String answer = myString.toLowerCase().replace("a", "A");
        return answer;
    }
}
