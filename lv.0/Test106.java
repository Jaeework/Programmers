/*
 * 주사위 게임 1
 */
public class Test106 {
    
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int result = solution(a, b);
        System.out.println(result);
    }

    private static int solution(int a, int b) {
        int answer = 0;

        boolean isAOdd = (a % 2 == 1);
        boolean isBOdd = (b % 2 == 1);

        if(isAOdd && isBOdd) {answer = (int)(Math.pow(a, 2) + Math.pow(b, 2));}
        else if(isAOdd || isBOdd) {answer = 2 * (a + b);}
        else {answer = Math.abs(a - b);}

        return answer;
    }
}
