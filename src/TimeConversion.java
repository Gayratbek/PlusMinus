import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class TimeConversionResult {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String hh = "";
        if (s.substring(8,9).equals("A") ){
           hh = s.substring(0,2);
           if (Integer.valueOf(hh) == 12) hh = "00";
            s = hh + s.substring(2,8);
        }
        else if (s.substring(8,9).equals("P")){
            hh = s.substring(0,2);
            if (Integer.valueOf(hh) > 0 && Integer.valueOf(hh) < 12){
                hh = String.valueOf(Integer.valueOf(hh) + 12);
            }
            s = hh + s.substring(2,8);
        }
        return s;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = TimeConversionResult.timeConversion(s);
        System.out.println(result);
        bufferedReader.close();
    }
}
