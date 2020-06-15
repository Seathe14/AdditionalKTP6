import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Ex6 {
    static final int MAX = 10000;

    // Array to store Ulam Number
    static Vector<Integer> arr = new Vector<Integer>();

    // function to compute ulam Number
    private static int ulam(int number)
    {

        // Set to search specific Ulam number efficiently
        Set<Integer> s = new HashSet<Integer>();

        // push First 2 two term of the sequence
        // in the array and set
        // for further calculation

        arr.add(1);
        s.add(1);

        arr.add(2);
        s.add(2);

        // loop to generate Ulam number
        for (int i = 3; i < MAX; i++) {

            int count = 0;

            // traverse the array and check if
            // i can be reprsented as sum of
            // two distinct element of the array

            for (int j = 0; j < arr.size(); j++) {

                // Check if i-arr[j] exist in the array or not using set
                // If yes, Then i can be represented as
                // sum of arr[j] + (i- arr[j])

                if (s.contains(i - arr.get(j)) && arr.get(j) != (i - arr.get(j)))
                    count++;

                // if Count is greater than 2
                // break the loop
                if (count > 2)
                    break;
            }

            // If count is 2 that means
            // i can be represented as sum of
            // two distinct terms of the sequence

            if (count == 2) {
                // i is ulam number
                arr.add(i);
                s.add(i);
            }
        }
        return arr.get(number-1);
    }
    public static void main(String[] args) {
        System.out.println(ulam(4));
        System.out.println(ulam(9));
    }
}
