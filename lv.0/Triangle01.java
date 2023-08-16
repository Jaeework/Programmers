/**
 * 삼각형의 완성조건 (1)
 */
public class Triangle01 {
    
    public static void main(String[] args) {
        int[] sides = {1, 2, 3};
        int result = solution(sides);

        System.out.println(result);
    }

    private static int solution(int[] sides) {
        int max = sides[0];
        int sum = 0;

        for(int i = 1; i < sides.length; i++) {
            if(max < sides[i]) {
                sum += max;
                max = sides[i];
            } else {
                sum += sides[i];
            }
        }
        
        return (max < sum) ? 1 : 2;
    }


}
