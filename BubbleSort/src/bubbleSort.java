import java.util.Random;
public class bubbleSort {
    public static void main(String args[]) {

        int array[] = new int[15];
        int i;

        //wypelnienie tablicy losowymi liczbami
        Random randomGenerator = new Random ();

        for (i = 0; i < array.length ; i++) {
            array[i] = randomGenerator.nextInt (100 );
        }

        //wyswietlenie z usunieciem ostatniego przecinka
        System.out.println("Tablica bez sortowania: ");
        for (i = 0; i <array.length; i++) {
            System.out.print (array[i]);
            if (i == array.length-1) continue;
            System.out.print(", ");
        }

        //sortowanie bombelkowe
        int tmp;

        for (int j = 0; j < array.length;j++) {
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }
            }
        }

        //wyswietlenie tabeli posrotowanej
        System.out.println("\nTablica posortowana: ");
        for (i = 0; i <array.length; i++) {
            System.out.print (array[i]);
            if (i == array.length-1) continue;
            System.out.print(", ");
        }
    }
}
