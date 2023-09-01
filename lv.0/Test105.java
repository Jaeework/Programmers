import java.util.Arrays;

/**
 * 배열의 길이에 따라 다른 연산하기
 */
public class Test105 {

    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;

        int[] result = solution(arr, n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr, int n) {
        int arrLen = arr.length;
        boolean isEven = (arrLen % 2 == 0);

        /* 
        for(int i = 0; i < arrLen; i++) {
            if(isEven && i % 2 != 0) {arr[i] += n;}
            else if(!isEven && i % 2 == 0) {arr[i] += n;}
        }
        */
        
         for(int i = isEven ? 1 : 0; i < arrLen; i+=2) {
            arr[i] += n;
         } 
         
         
        
        return arr;
    }
    
}
