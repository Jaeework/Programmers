/**
 * 모음 제거
 */
public class RemoveVowel {
    
    public static void main(String[] args) {
        String my_string = "bus";
        String result = solution(my_string);

        System.out.println(result);
    }

    private static String solution(String my_string) {
        String[] vowels = {"a", "e", "i", "o", "u"};

        for(String vowel : vowels) {
            my_string = my_string.replace(vowel, "");
        }
        
        return my_string;
    }

}
