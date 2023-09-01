/*
 * 배열 비교하기
 */
public class Test109 {
    
    public static void main(String[] args) {
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};

        int result = solution(arr1, arr2);
        System.out.println(result);
    }

    private static int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        int arr1Len = arr1.length;
        int arr2Len = arr2.length;

        if(arr1Len > arr2Len) {answer = 1;}
        else if(arr1Len < arr2Len) {answer = -1;}
        else {
            int sum1 = 0;
            int sum2 = 0;
            for(int i : arr1) {
                sum1 += i;
            }
            for(int i : arr2) {
                sum2 += i;
            }

            if(sum1 > sum2) {answer = 1;}
            if(sum1 < sum2) {answer = -1;}
        }

        return answer;
    }
}
