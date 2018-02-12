import java.util.Random;
public class quickSort {
    public static void main (String args[]){

//        int array[] = new int[9];
//        Random random = new Random();
//
//        System.out.println("Tablica nieposrtowana: ");
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextInt( 25+5+1) -5;
//            System.out.print(array[i]);
//            if (i == array.length-1) continue;
//            System.out.print(", ");
//        }

    int array[] = {14, 17, 5, 0, 11, 12, 18, 21, 5, 3, 4};

        System.out.println("\nTablica nieposortowana: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i == array.length-1) continue;
            System.out.print(", ");
        }

    //quicksort

        //znalezienie pivotu
        int pivot = array[array.length/2];
        int pivotIndex = array.length/2;
        System.out.println("\nWartosc Pivota: " + pivot + "\nindex tablicy: [" + pivotIndex + "]");

        //zamiana pivotu z ostatnią wartoscią tablicy
        int tmp;
        tmp = array[array.length-1];
        array[array.length-1] = pivot;
        array[array.length/2] = tmp;

        //szukanie mniejszej liczby od pivota
        int a,b;
        int z=0;

        for (int i=0; i < array.length; i++){
            if (array[i] > pivot) continue;
            a = array[i];

            for (int j=z; j < array.length ; j++) {
                b = array[j];
                array[i] = b;
                array[j] = a;

                //bedzie zaczynac ponownie petle od pozycji o 1 wieksza
                z = j + 1;
                break;
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
