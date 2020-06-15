import java.util.LinkedList;
import java.util.List;

public class Ex3 {
    private static boolean validColor(String color)
    {
        String param = "";
        for(String temp : color.split("\\(")) {
            param = temp;
            break;
        }
        int count = 0;
        int r,g,b,a;
        double dr,dg,db,da;
        List<String> checkList = new LinkedList<>();
        if(param.equals("rgb"))
        {
            if(color.charAt(color.length()-1) == ')')
            {
                color = color.substring(4);
                color = color.substring(0,color.length()-1);
                for(String temp : color.split(",")) {
                    if(!temp.isEmpty()) {
                        checkList.add(temp);
                        count++;
                    }
                }
                if(checkList.size() == 3) {
                    r = Integer.parseInt(checkList.get(0));
                    g = Integer.parseInt(checkList.get(1));
                    b = Integer.parseInt(checkList.get(2));
                    if(!(r>=0 && r<256) || !(g>=0 && g<256) || !(b>=0&&b<256))
                        return false;
                    else
                    {
                        return true;
                    }
                }

            }
        }
        else if(param.equals("rgba"))
        {
            if(color.charAt(color.length()-1) == ')')
            {
                color = color.substring(5);
                color = color.substring(0,color.length()-1);
                for(String temp : color.split(",")) {
                    if(!temp.isEmpty()) {
                        checkList.add(temp);
                        count++;
                    }
                }
                if(checkList.size() == 4) {
                    dr = Double.parseDouble(checkList.get(0));
                    dg = Double.parseDouble(checkList.get(1));
                    db = Double.parseDouble(checkList.get(2));
                    da = Double.parseDouble(checkList.get(3));
                    if(!(dr>=0 && dr<=1) || !(dg>=0 && dg<=1) || !(db>=0&&db<=1) || !(da>=0&&da<=1))
                        return false;
                    else
                    {
                        return true;
                    }
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(validColor("rgb(0,0,0)"));
        System.out.println(validColor("rgb(255,256,255)"));
        System.out.println(validColor("rgb(0,,0)"));
        System.out.println(validColor("rgb(255,255,255)"));
        System.out.println(validColor("rgba(0,0,0,0.123456789)"));
        System.out.println(validColor("rgba(0,0,5,0.123456789)"));
    }
}
