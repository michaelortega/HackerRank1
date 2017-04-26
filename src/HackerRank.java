
import java.io.IOException;
import java.util.Scanner;
//import java.util.Scanner;

public class HackerRank {
    //if each fraction has an index
    static String[] ReduceFraction1(String[] fractions) {
        String[] temp;
        String[] returnArray = new String[Integer.parseInt(fractions[0])];
        int numerator;
        int denominator;
        int num;
        int den;
        for (int index = 1; index < fractions.length; index++) {
            temp = fractions[index].split("/");
            numerator = Integer.parseInt(temp[0]);
            denominator = Integer.parseInt(temp[1]);
            num = Integer.parseInt(temp[0]);
            den = Integer.parseInt(temp[1]);
            while (den != 0) {
                int t = den;
                den = num % den;
                num = t;
            }
            numerator = numerator / num;
            denominator = denominator / num;

            returnArray[index - 1] = String.valueOf(numerator).concat("/").concat(String.valueOf(denominator));
        }
        return returnArray;

    }

    static String[] ReduceFraction(String[] fractions) {
        Scanner scan = new Scanner(fractions[0]);
        int fractionCount = Integer.parseInt(scan.nextLine());
        String[] temp;
        String resultString = "";
        int numerator;
        int denominator;
        int num;
        int den;
        int index = 0;
        while (fractionCount != 0) {
            String fraction = scan.nextLine();
            temp = fraction.split("/");
            numerator = Integer.parseInt(temp[0]);
            denominator = Integer.parseInt(temp[1]);
            num = Integer.parseInt(temp[0]);
            den = Integer.parseInt(temp[1]);
            while (den != 0) {
                int t = den;
                den = num % den;
                num = t;
            }
            numerator = numerator / num;
            denominator = denominator / num;
            resultString = resultString.concat(String.valueOf(numerator).concat("/").concat(String.valueOf(denominator)));
            index++;
            fractionCount--;
        }
        fractions[0] = resultString;
        return fractions;
    }


    public static void main(String[] args) throws IOException {
        String[] arr = {"10\n" +
                "825/1161\n" +
                "1092/1041\n" +
                "315/840\n" +
                "1104/1119\n" +
                "724/404\n" +
                "692/176\n" +
                "208/286\n" +
                "65/362\n" +
                "126/151\n" +
                "270/318"};
        arr = ReduceFraction(arr);
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
