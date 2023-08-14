/**
 * 코드 처리하기
 */
public class HandleCode {
    
    public static void main(String[] args) {

        String result = solution("abc1abc1abc");

        System.out.println(result);

    }

    private static String solution(String code) {

        String ret = "";
        Boolean modeZero = true;

        for(int i = 0; i < code.length(); i++) {
            char temp = code.charAt(i);
            if(temp == '1') {
                modeZero = !modeZero;
                continue;
            }

            if(modeZero) {
                if(i % 2 == 0) {
                    ret += temp;
                }
            } else {
                if(i % 2 != 0) {
                    ret += temp;
                }
            }
        }
        

        return (ret.length() != 0) ? ret : "EMPTY";
    }


}
