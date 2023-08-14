/**
 * 편지
 */
public class Message {
    
    public static void main(String[] args) {
        String message = "happy birthday!";
        int result = solution(message);

        System.out.println(result);
    }

    private static int solution(String message) {
        
        return message.length() * 2;
    }
}
