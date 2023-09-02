/*
 * 배열에서 문자열 대소문자 변환하기
 */

import java.util.Arrays;

public class Test111 {

    public static void main(String[] args) {
        String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
        
        String[] result = solution(strArr);
        System.out.println(Arrays.toString(result));
    }

    private static String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0) {strArr[i] = strArr[i].toLowerCase();}
            else {strArr[i] = strArr[i].toUpperCase();}
        }
        
        return strArr;
    }
    
}
