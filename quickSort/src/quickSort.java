import java.util.Random;
public class quickSort {
    public static void main (String args[]){

/*        int array[] = new int[9];
        Random random = new Random();

        System.out.println("Tablica nieposrtowana: ");
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt( 20+20+1) - 20;
            System.out.print(array[i]);
            if (i == array.length-1) continue;
            System.out.print(", ");
        }*/

    int array[] = {14, 17, 5, 0, 11, 12, 8, 2, 5, 3, 4};

        System.out.println("\nTablica nieposortowana: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i == array.length-1) continue;
            System.out.print(", ");
        }

    //quicksort

        //znalezienie pivota
        int pivot = array[array.length/2];
        int pivotIndex = array.length/2;
        System.out.println("\nWartosc Pivota: " + pivot + "\nindex tablicy: [" + pivotIndex + "]");

        //szukanie wiekszej liczby po lewej stronie
        int l,r;
        int z = array.length-1;
       quickS: for (int i=0; i < pivotIndex; i++){
            if (array[i] < pivot) continue;
            l = array[i];

        //gdy znajdzie wieksza liczbe po stronie lewej szuka liczby mniejszej po stronie prawej od pivota
            for (int j=z; j >= pivotIndex ; j--) {
                if (array[j] >= pivot) continue;
                r = array[j];
                array[i] = r;
                array[j] = l;

                //bedzie zaczynac ponownie petle od pozycji o 1 mniejszej
                z = j - 1;
                continue quickS;


            }

        }

        System.out.println("\nTablica posrtowana: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i == array.length-1) continue;
            System.out.print(", ");
        }

    }
}
