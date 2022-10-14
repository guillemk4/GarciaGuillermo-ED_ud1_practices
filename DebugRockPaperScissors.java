package ud1.practices;

import java.util.Locale;
import java.util.Scanner;

public class DebugRockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Introdueix l'elecció del jugador 1 (pedra/paper/tisores): ");
        String p1 = in.nextLine();
        System.out.print("Introdueix l'elecció del jugador 2 (pedra/paper/tisores): ");
        String p2 = in.nextLine();

        if(p1.equals(p2))
            System.out.println("Empat!");
        else if (p1.equals("paper")) {
            if(p2.equals("pedra"))
                System.out.println("Guanya jugador 1!");
            else
                System.out.println("Guanya jugador 2!");
        } else if (p1.equals("pedra")) {
            if(p2.equals("paper"))
                System.out.println("Guanya jugador 2!");
            else
                System.out.println("Guanya jugador 1!");
        } else {
            if(p1.equals("tisores"))
                if(p2.equals("paper"))
                System.out.println("Guanya jugador 1!");
            else
            System.out.println("Guanya jugador 2!");
        }
    }

    }
