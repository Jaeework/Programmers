/**
 * 문자열 붙여서 출력하기
 */
import java.util.Scanner;

public class StringConcat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str01 = sc.next();
        String str02 = sc.next();

        System.out.printf("%s", str01.concat(str02));
        sc.close();
    }
    
}
