import java.util.Scanner;

public class printab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d", b);

        sc.close();
    }

}