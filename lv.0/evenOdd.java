/**
 * 홀짝 구분하기
 */
import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*String answer = String.format("%s is ", n);

        if(n % 2 == 0) {
            answer += "even";
        } else {
            answer += "odd";
        }

        System.out.println(answer);
        */

        System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
        sc.close();
    }

    
}
