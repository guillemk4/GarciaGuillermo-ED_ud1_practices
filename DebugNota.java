package ud1.exercises;

import java.util.Locale;
import java.util.Scanner;

public class DebugNota {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Nota de pràctiques:");
        double practices = in.nextDouble();
        System.out.println("Nota d'exàmens:");
        double exams = in.nextDouble();

        double total = practices * 0.4 + exams * 0.6;

        int llindarsSuperats = 0;
        if(exams < 4 && exams >= 3.75)
            llindarsSuperats++;
        if(practices < 5 && practices >= 4.75)
            llindarsSuperats++;
        if(total < 5 && total >= 4.75)
            llindarsSuperats++;

        if (exams < 3.75 || practices < 4.75 || total < 4.75 || llindarsSuperats == 2)
            System.out.println("No superat");
        else
        if (llindarsSuperats > 0)
            System.out.println("Superat");
        else if (total >= 5)
            System.out.println("Suficient");
        else if (total >= 6)
            System.out.println("Bé");
        else if (total >= 7)
            System.out.println("Notable");
        else if (total >= 9)
            System.out.println("Excel·lent");
        else if (total >= 10)
            System.out.println("Excel·lent");



    }
}