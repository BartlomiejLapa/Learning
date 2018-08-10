package exceptions;
import java.lang.Math.*;
import java.util.Scanner;

class Pierwiastkowanie {
    static int result;

    static void sqrtNumber(int number) {
        result = (int) Math.sqrt(number);
        System.out.format("%s %d %s  %d ", "Pierwiastek z ", number ," wynosi ", result);

    }

}

public class Pierwiastek {
    public static void main(String args[]) throws java.io.IOException {
        int odczytNumber;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbe do pierwiastkowania");
        try {
            odczytNumber = odczyt.nextInt();
            if (odczytNumber < 0)
                throw new IllegalArgumentException("Nie ma pierwiastka z liczb ujemnych(chuja prawda)");
            Pierwiastkowanie.sqrtNumber(odczytNumber);
        } catch (java.util.InputMismatchException exc) {
            System.out.println("Podano niewlasciwy znak");
        }

    }

}
