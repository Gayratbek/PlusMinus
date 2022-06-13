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



class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);

        return arr.get(arr.size()/2);


//        for (int i = 0; i < arr.size(); i++) {
//            int katta = 0;
//            int kichik = 0;
//            for (int j = 0; j < arr.size(); j++) {
//                if(arr.get(i) >= arr.get(j)) katta ++ ;
//                else if (arr.get(i) < arr.get(j)) kichik++;
//            }
//            if(katta == kichik) {
//                median = arr.get(i);
//                return median;
//            }
//
//        }

    }

}

public class Median {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.findMedian(arr);
        System.out.println(result);

        bufferedReader.close();

    }
}
