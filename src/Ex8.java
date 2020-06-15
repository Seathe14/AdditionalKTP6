import java.util.Collections;

import static java.lang.String.join;

public class Ex8 {
    public static String convertToRoman(int number) {
        return join("", Collections.nCopies(number, "I"))   // join - разделитель //ncopies копируем I number раз, и заменяем
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }
    public static void main(String[] args) {
        System.out.println(convertToRoman(2));
        System.out.println(convertToRoman(12));
        System.out.println(convertToRoman(16));
    }
}
