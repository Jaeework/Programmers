/**
 * 옷가게 할인 받기
 */
public class SalePrice {
    
    public static void main(String[] args) {
        int result = solution(150000);

        System.out.println(result);
    }

    private static int solution(int price) {
        int answer = 0;

        if(price >= 500000) {answer = (int)(price * 0.8);}
        else if(price >= 300000) {answer = (int)(price * 0.9);}
        else if(price >= 100000) {answer = (int)(price * 0.95);}
        else {answer = price;}

        return answer;
    }
}
