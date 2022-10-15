package ud1.exercises;

import java.util.Locale;
import java.util.Scanner;

public class DebugVariables {
    //la variable string se utiliza para representar una cadena
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        //scaner hace la funcion de poder escribir con el teclado una vez ejecutado el codigo
        System.out.print("Introdueix el primer número: ");
        int a = in.nextInt();
        //El las dos variables print se utilizan para mostran en pantalla el texto que les procede
        System.out.print("Introdueix el segon número: ");
        int b = in.nextInt();
    //hace la primera suma a * 2*b
        int c = a + 2*b;
        int d = c % a;
    //los boolean son operadores que solo tienen dos formas true o folse
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