import java.util.ArrayList;
public class Main {
    public static int onum;

    public static void main(String[] args) {
        //Main Homework
        printer(0);
        printer(1);
        printer(63);
        printer(127);
        printer(255);
        printer(256);

        /*
        //Extra Credit
        //Converts all numbers 0-100 to all bases 1-16
        for (int j = 1; j <= 16; j++) {
            System.out.println("\nBase " + j);
            for (int i = 0; i <= 101; i++) {
               System.out.println(i + " " + any(i,j));
            }
       }
       */

    }

    public static void printer(int a) {
        onum = a;
        String b = bin(a);
        String c = oct(a);
        String d = hex(a);
        if (a<10)        System.out.printf("  %d: (Binary) %s (Octal) %s (Hex) %s \n",a,b,c,d);
        if (a<100&&a>=10) System.out.printf(" %d: (Binary) %s (Octal) %s (Hex) %s \n",a,b,c,d);
        if (a>=100)         System.out.printf("%d: (Binary) %s (Octal) %s (Hex) %s \n",a,b,c,d);
    }


    public static String bin(int a) {
        String binbinbin = "";
        int[] binbin = new int[9];

        for (int i = 8; i >= 0; i--) {
            binbin[i] = a % 2;
            a /= 2;
        }

        for (int k = 0; k < 9; k++) {
            binbinbin += Integer.toString(binbin[k]);
        }

        return binbinbin;
    }



    public static String oct(int a) {
        String oct3 = "";
        int[] oct2 = new int[9];

        for (int i = 8; i >= 0; i--) {
            oct2[i] = a % 8;
            a /= 8;
        }

        for (int k = 0; k < 9; k++) {
            oct3 += Integer.toString(oct2[k]);
        }

        return oct3;
    }



    public static String hex(int a) {
        int[] hex2 = new int[9];
        for (int i = 8; i >= 0; i--) {
            hex2[i] = a % 16;
            a /= 16;
        }

        String hex3 = letters(hex2);
        return hex3;
    }



    public static String letters(int[] oct2) {
        String build = "";
        for (int i = 0; i < oct2.length; i++) {
            switch (oct2[i]) {
                case 10: build += 'A'; break;
                case 11: build += 'B'; break;
                case 12: build += 'C'; break;
                case 13: build += 'D'; break;
                case 14: build += 'E'; break;
                case 15: build += 'F'; break;
                default: build += Integer.toString(oct2[i]); break;
            }
        }
        return build;
    }



    public static String any(int a, int b) {
        int[] any2 = new int[9];
        if (a <= b) {
            any2[8] = a;
        }
        if (a >= b) {
            for (int i = 8; i >= 0; i--) {
                any2[i] = a % b;
                a /= b;
            }
        }
        String any3 = letters(any2);
        return any3;
    }



/* Other helpful code:


        String SorigNum = "";
        for (int i = 0; i < 9; i++) {
            SorigNum += a1[i];
        }
        int origNum = Integer.parseInt(SorigNum);
        ^-- converts encrypted number array into actual number

          for (int i = 0; i < 9; i++) {
            a1[8 - i] = Integer.toString(a / (int)(Math.pow(10,i)) % 10);
        }
        ^---- converts original number into encrypted number array(base 10)


        max decimal to binary is 511(becomes 111111111)


        OR you could just get rid of each individual methods and just have
        one method that inputs the number and base and make things simpler

 */


}

