import java.util.Arrays;

public class Ex2 {
    static boolean isVowel(char c) {
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    static String translateWord(String s) {

        int len = s.length();
        int index = -1;
        for (int i = 0; i < len; i++)
        {
            if (isVowel(s.charAt(i))) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return "-1";
        if(isVowel(s.charAt(0)))
            return s.substring(index) +
                    s.substring(0, index) + "yay";
        return s.substring(index) +
                s.substring(0, index) + "ay";
    }
    public static void main(String[] args) {
        System.out.println(translateWord("flag"));
        System.out.println(translateWord("Apple"));
        System.out.println(translateWord("Button"));
    }
}
