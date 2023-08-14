/**
 * 특정 문자 제거하기
 */
public class RemoveLetter {
    
    public static void main(String[] args) {
        String result = solution("BCBdbe", "B");
        System.out.println(result);
    }

    private static String solution(String my_string, String letter) {
        
        return my_string.replace(letter, "");
    }
}
