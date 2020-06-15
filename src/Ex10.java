public class Ex10 {
    private static boolean isSymmetrical(int num)
    {
        int reversenum = 0, n = num;
        if(n < 0) n = n*-1;
        while(n!=0)
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + n%10;
            n=n/10;
        }
        return (reversenum == num);
    }
    private static int getSumOfDigits(int n)
    {
        String iString = Integer.toString(n);
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<iString.length()-1;i+=2)
        {
            int i1 = Integer.parseInt(Character.toString(iString.charAt(i)));
            int i2 = Integer.parseInt(Character.toString(iString.charAt(i+1)));
            int num = i1+i2;
            sb.append(Integer.toString(num));
        }
        return Integer.parseInt(sb.toString());
    }
    private static boolean palindromeDescedant(int num)
    {
        boolean isSym = false;
        while(num > 0)
        {
            if(isSymmetrical(num))
            {
                isSym = true;
                break;
            }
            num = getSumOfDigits(num);
        }
        return isSym;
    }
    public static void main(String[] args) {
        System.out.println(palindromeDescedant(11211230));
        System.out.println(palindromeDescedant(13001120));
        System.out.println(palindromeDescedant(11));
        System.out.println(palindromeDescedant(7));
    }
}
