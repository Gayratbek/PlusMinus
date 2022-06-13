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

class KaprekarResult {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        long sumofnumbers;
        int count = 0;
        for (int i = p; i <=q ; i++) {
            String s = String.valueOf((long) Math.pow(i,2));
            if (s.length()>1){
                sumofnumbers = Integer.valueOf(s.substring(0,s.length()/2));
                sumofnumbers += Integer.valueOf(s.substring(s.length()/2));
            }
            else sumofnumbers = Integer.valueOf(s);

            if (i==sumofnumbers) {
                count++;
                System.out.print(i + " ");
            }


        }
        if (count==0) System.out.println("INVALID RANGE");
    }

}

public class KaprekarNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        KaprekarResult.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
