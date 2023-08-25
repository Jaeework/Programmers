/**
 * rny_string
 */
public class StrReplace {
    
    public static void main(String[] args) {
        String rny_string = "masterpiece";
        String result = solution(rny_string);
        System.out.println(result);
    }

    private static String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
