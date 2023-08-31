/**
 * 문자열 바꿔서 찾기
 */
public class Test103 {

    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";

        int result = solution(myString, pat);
        System.out.println(result);
    }

    private static int solution(String myString, String pat) {
        String changedStr = "";

        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') {changedStr += "B";}
            else if(myString.charAt(i) == 'B') {changedStr += "A";}
        }

        if(changedStr.contains(pat)) {return 1;}


        return 0;
    }
    
}
