package ud1.practices;

import java.util.Locale;
import java.util.Scanner;

public class DebugVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        //rt
        System.out.print("Introdueix el primer número: ");
        int a = in.nextInt();
        //ecribir explicacion
        System.out.print("Introdueix el segon número: ");
        int b = in.nextInt();

        int c = a + 2*b;
        int d = c % a;

        boolean op1 = a > b;
        boolean op2 = b - c > 0;
        boolean complexOperator = (!op1 ^ op2);

        int counter = 0;
        while (a > b){
            a -= 5;
            b *= 2;
            counter ++;
        }
    }
}