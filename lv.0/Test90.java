/**
 * 대문자로 바꾸기
 */
public class Test90 {
   
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        
        String result = solution(myString);
        System.out.println(result);
    }

    private static String solution(String myString) {
        
        return myString.toUpperCase();
    }
}
