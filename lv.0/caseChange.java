import java.util.Scanner;

public class caseChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += c;
            }
        }

        /*
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }

            arr[i] = c;
        }

        str = String.valueOf(arr);
        */
        System.out.println(answer);
        sc.close();
    }
    
}
