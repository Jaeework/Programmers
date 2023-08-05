/**
 * 수 조작하기 1
 */
public class manipulateNum01 {
    
    public static void main(String[] args) {

        int result = solution(0, "wsdawsdassw");

        System.out.println(result);
        
    }

    private static int solution(int n, String control) {
        for(int i = 0; i < control.length(); i++) {
            char ch = control.charAt(i);
            n += manipulate(ch);
        }

        return n;
    }

    private static int manipulate(char ch) {
       int addition = 0;

        switch(ch) {
            case 'w' :
                addition = 1;
                break;
            case 's' :
                addition = -1;
                break;
            case 'd' : 
                addition = 10;
                break;
            case 'a' : 
                addition = -10;
                break;
        }

        return addition;
    }
}
