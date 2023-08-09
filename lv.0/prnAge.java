/**
 * 나이 출력
 */
public class prnAge {
    
    public static void main(String[] args) {
        int result = solution(40);
        System.out.println(result);
    }

    private static int solution(int age) {
        return (2022 - age + 1);
    }
}
