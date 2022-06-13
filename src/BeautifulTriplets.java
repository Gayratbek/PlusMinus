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

class BeautifulTripletsResult {

    /*
     * Complete the 'beautifulTriplets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int result = 0;
        for (int i = 0; i <arr.size() ; i++) {
            int count = 1;
            int temp = arr.get(i);
            boolean finish = false;
            for (int j = i + 1; j <arr.size(); j++) {
               if (!finish){
                   if (arr.get(j) - temp == d){
                       count++;
                       temp = arr.get(j);
                   }
                   if (count == 3 ) {
                       result++;
                       finish = true;
                   }
               }
            }
        }
        return result;

    }

}

public class BeautifulTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = BeautifulTripletsResult.beautifulTriplets(d, arr);
        System.out.println(result);
     
        bufferedReader.close();
     }
}
