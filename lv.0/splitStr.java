/**
 * 문자열 돌리기
 */
import java.util.Scanner;

public class SplitStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(char ch : str.toCharArray()) {
            System.out.println(ch);
        }

        sc.close();
    }
    
}
