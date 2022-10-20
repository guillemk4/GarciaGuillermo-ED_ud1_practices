package ud1.exercises;

import java.util.Locale;
import java.util.Scanner;

/*
 * El resultat de l'operació de collatz
 * per a N = 27 després de 12 iteracions
 * és 322
 */

public class DebugCollatz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Introdueix un número: ");
        int inicial = in.nextInt();
        int n = inicial;
        int counter = 0;

        do {
            if(n % 2 == 0)
                n = n / 2 ;
            else
                n = (n * 3)+1;
            counter++;
        } while (n != 1);

        System.out.printf("S'ha arribat del %d al 1 després de %d passos.\n", inicial, counter);
    }
}