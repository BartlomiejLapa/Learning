import java.util.Random;
public class quickSort {
    public static void main (String args[]){

        int array[] = new int[9];
        Random random = new Random();

        System.out.println("Tablica nieposrtowana: ");
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt( 20+20+1) - 20;
            System.out.print(array[i]);
            if (i == array.length-1) continue;
            System.out.print(", ");
        }

    //quicksort

        //znalezienie pivota
        System.out.println("\nWartosc Pivota: " + array[array.length/2] + "\nindex tablicy: [" + array.length/2 + "]");

    }
}
