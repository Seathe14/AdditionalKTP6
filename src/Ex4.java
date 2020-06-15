import java.util.HashMap;
import java.util.Map;

public class Ex4 {
    public static String stripUrlParams(String url, String ...param)
    {
        Map<String, Integer> values = new HashMap<String, Integer>();
        String[] parts = url.split("\\?");

        if (parts.length < 2)
            return url;

        String[] params = parts[1].split("&");

        for (String parameter : params)
        {
            String key = parameter.substring(0, parameter.indexOf('='));
            String valueStr = parameter.substring(parameter.indexOf('=') + 1);
            int value = Integer.parseInt(valueStr);
            values.put(key, value);

        }

        String result = "";

        result += parts[0] + "?";

        for (String key : values.keySet())
        {
            boolean notDisplay = false;
            for (int i = 0; i < param.length; i++)
            {
                if (param[i].contains(key))
                {
                    notDisplay = true;
                }
            }
            if (notDisplay)
                continue;
            result += key + "=" + values.get(key) + "&";
        }

        return result.substring(0, result.length() - 1);

    }
    public static void main(String[] args) {
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2"));
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2","b"));
    }
}
