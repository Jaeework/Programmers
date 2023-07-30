/**
 * 홀짝에 따라 다른 값 반환하기
 */
public class evenOdd02 {

    public static void main(String[] args) {
        int result = solution(10);
        System.out.println(result);
    }

    private static int solution(int n) {

        //boolean stop = false;
        int answer = 0;

        while(n > 0) {
            if(n % 2 == 0) {
                answer += Math.pow(n, 2);
            } else {
                answer += n;
            }

            n -= 2;
        }
/*
        if(n % 2 == 0) {
            while(!stop) {
                answer += Math.pow(n, 2);
                n -= 2;

                if(n <= 0) {
                    stop = true;
                }
            }
        } else {
            while(!stop) {
                answer += n;
                n -= 2;

                if (n <= 0) {
                    stop = true;
                }
            }

        }
*/
        return answer;
    }
    

    
}
