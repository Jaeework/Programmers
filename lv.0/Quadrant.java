/**
 * 점의 위치 구하기
 */
public class Quadrant {

    public static void main(String[] args) {
        int[] dot = {-3, 2};
    int result = solution(dot);

    System.out.println(result);
    }

    private static int solution(int[] dot) {
        
        if(dot[0] > 0) {
            if(dot[1] > 0) {
                return 1;
            } else if(dot[1] < 0) {
                return 4;
            }
        } else if(dot[0] < 0) {
            if(dot[1] > 0) {
                return 2;
            } else if(dot[1] < 0) {
                return 3;
            }
        }

        return 0;
    }
}
