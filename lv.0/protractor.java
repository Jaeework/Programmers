/**
 * 각도기
 */
public class protractor {

    public static void main(String[] args) {
        int result = solution(70);

        System.out.println(result);
    }

    private static int solution(int angle) {
        int answer = 0;

        if(angle > 0 && angle < 90) {answer = 1;}
        else if(angle == 90) {answer = 2;}
        else if(angle > 90 && angle < 180) {answer = 3;}
        else if(angle == 180) {answer = 4;}

        return answer;
    }    
    
}
