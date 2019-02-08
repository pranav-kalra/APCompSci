import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int onum;

    public static void main(String[] args) {
        // write your code here


        printer(9);
    }

    public static void printer(int a) {
        onum = a;
        String b = bin(a);
        String c = oct(a);
        String d = hex(a);
        System.out.printf("%d: (Binary) %s (Octal) %s (Hex) %s",a,b,c,d);
    }



    public static String bin(int a) {
        String binbinbin = "";
        int[] binbin = new int[9];
        for (int i = 8; i >= 0; i--) {
            if (Math.pow(2, i) > a) binbin[8 - i] = 0;
            if (Math.pow(2, i) <= a) {
                binbin[8 - i] = 1;
                a -= Math.pow(2, i);
            }
        }

        for (int k = 0; k < 9; k++) {
            binbinbin += Integer.toString(binbin[k]);
        }

        return binbinbin;

    }





    public static String oct(int a) {
        String oct3 = "";
        int[] oct2 = new int[9];
        if (a <= 8) oct2[8] = a;
        if (a > 8) {
            for (int i = 8; i >= 0; i--) {
                oct2[i] = a % 8;
                a /= 8;
            } }

        for (int k = 0; k < 9; k++) {
            oct3 += Integer.toString(oct2[k]);
        }

        return oct3;


    }

    public static String hex(int a) {
        String hexhexhex = Integer.toString(a);
        return hexhexhex;

    }

    public static String any(int a) {
        String anyanyany = Integer.toString(a);
        return anyanyany;
        //Don't upload
    }



/* Other helpful code:


 String SorigNum = "";
        for (int i = 0; i < 9; i++) {
            SorigNum += a1[i];
        }
        <-- takes encrypted code into original number

          for (int i = 0; i < 9; i++) {
            a1[8 - i] = Integer.toString(a / (int)(Math.pow(10,i)) % 10);
        }
        <---- takes original number and breaks down into array


        max decimal to binary is 511


        return build;
    }















 */



}

