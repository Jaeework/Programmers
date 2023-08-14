/**
 * 문자열 여러 번 뒤집기
 */
public class ReverseStr {
    
    public static void main(String[] args) {
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String result = solution("rermgorpsam", queries);
        System.out.println(result);
    }

    private static String solution(String my_string, int[][] queries) {
        for(int[] query : queries) {
            int start = query[0];
            int end = query[1];
            String substr = my_string.substring(start, end + 1);
            char[] tempArr = substr.toCharArray();
            char[] reverseArr = new char[tempArr.length];

            for(int i = 0; i < tempArr.length; i++) {
                reverseArr[i] = tempArr[tempArr.length - i - 1];
            }

            my_string = my_string.substring(0, start) 
                      + String.valueOf(reverseArr) 
                      + my_string.substring(end + 1, my_string.length());
        }

        return my_string;
    }
}
