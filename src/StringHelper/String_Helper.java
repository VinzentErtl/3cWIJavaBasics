package StringHelper;

public class String_Helper {

    public static void main(String[] args) {
        int result = countLetters("Hans achtet auf mich ", 'e');
        System.out.println(result);
    }

    public static boolean isPalindrome(String text){
        // A n n A

        return false;
    }

    public static int countLetters(String text, char search){
        //Hans
        char[] textArray = text.toCharArray();
        int count = 0;
        // 0 1 2 3
        // H A N S

        for (int i = 0; i < textArray.length; i++) {
            if(textArray[i]==search){
                count++;
            }
        }
        return count;
    }
}
