import java.io.*;

class TheTimeInWordsResult {

    public static String timeInWords(int h, int m) {
        // Write your code here

        String minuteInWords = new String();
        boolean nexthour = false;
        String [] numnames  = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String [] tensnames = {"","ten","twenty","thirty", "fourty","fifty","sixty","seventy","eighty","ninety"};

        String sepstring = "";
        if (m>30) {
            m = 60 - m;
            nexthour =true;
            sepstring = " minutes to ";
        }
        else {
            sepstring = " minutes past ";
        }

        String minString = new String();
        if (m == 0){
            minuteInWords = numnames[h].trim() + " o' clock";
        }
        else if (m == 15){
            if (nexthour) minuteInWords = "quarter to " + numnames[h+1].trim();
            else minuteInWords = "quarter past " + numnames[h].trim();

        }
        else if (m==30){
             minuteInWords = "half past " + numnames[h].trim();
        }
        else if (m<30){
            if (m==1) {

                if (nexthour)sepstring = " minute to ";
                else sepstring = " minute past ";
            }
            if (m<20) minString = numnames[m%20];
            else {
                minString = numnames[m % 10];
                m /= 10;
                minString = tensnames[m % 10] + " " +  minString;
            }
            if (nexthour)minuteInWords = minString.trim() + sepstring + numnames[h+1].trim();
            else minuteInWords = minString.trim() + sepstring + numnames[h].trim();

        }

        return minuteInWords;

    }

}

public class TheTimeInWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = TheTimeInWordsResult.timeInWords(h, m);
        System.out.println(result);

        bufferedReader.close();
    }
}
