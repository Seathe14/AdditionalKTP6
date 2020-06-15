import java.util.Vector;
import  org.mariuszgromada.math.mxparser.*;

public class Ex9 {
    private static boolean formula(String str) {
        String[] expressions = str.split("=");
        Vector<Double> results = new Vector<Double>();
        Expression e = new Expression(str);
        for (String expression : expressions)
        {
            e = new Expression(expression);
            results.add(e.calculate());
        }
        double check = results.get(0);

        for (Double value : results)
        {
            if (value != check)
                return false;
        }

        return true;


    }
    public static void main(String[] args) {
        System.out.println(formula("6 * 4 = 24"));
        System.out.println(formula("6 * 4 = 26"));
        System.out.println(formula("18 / 17 = 2"));
        System.out.println(formula("7 * 4 = 28"));
    }
}
