import java.util.Arrays;

public class Ex5 {
    private static String [] getHashTags(String sentence)
    {
        String[] longestWords = {"","",""};
        String [] words = sentence.split(" ");
        for(String word:words)
        {
            if (!Character.isLetter(word.charAt(word.length() - 1)))
                word = word.substring(0, word.length() - 1);
            if(word.length()>longestWords[0].length())
            {
                longestWords[2] =    longestWords[1];
                longestWords[1] = longestWords[0];
                longestWords[0] = word;
            }
            else if(word.length() > longestWords[1].length())
            {
                longestWords[2] = longestWords[1];
                longestWords[1] = word;
            }
            else if(word.length()>longestWords[2].length())
            {
                longestWords[2] = word;
            }
        }
        for(int i =0;i<longestWords.length;i++)
        {
            longestWords[i] = "#" + longestWords[i];
        }
    return longestWords;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHashTags("How the Avocado Became the Fruit of the Global Trade")));
    }
}
