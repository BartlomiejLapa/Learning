package exceptions;

class Devide {
    double array1[],array2[];
    private int putloc;
    int size;


   Devide(int size) {
        this.size = size;
        array1 = new double [size];
        array2 = new double [size];
        putloc = 0;
    }

    void putArray(double z, double y){
        array1[putloc] = z;
        array2[putloc] = y;
        putloc++;
    }
    void showArray(){
        System.out.print ("Tablica 1: ");
        for (int i=0; i < putloc+1 && i < array1.length; i++) System.out.print (array1[i] + " ");

        System.out.print ("Tablica 2: ");
        for (int i=0; i < putloc+1 && i < array2.length; i++) System.out.print (array2[i] + " ");
    }
    void deviding() {
        for (int i=0; i < putloc+1 && i < array1.length && i < array2.length; i++) System.out.println (array1[i] + ":" + array2[i] + " = " + (int)array1[i]/(int)array2[i]);
    }
}

public class ExcDevide {
    public static void main(String args[]) {

        try {

            Devide devide = new Devide (5);

            for (int i = 0; i < devide.size; i++) {
                double z, y;
                z = i * 33.1 / 5 + 7;
                y = devide.size-3-i;
                devide.putArray (z, y);
            }
            devide.showArray ( );
            System.out.println ("\n");
            devide.deviding ( );

        } catch (ArithmeticException exc1) {
            System.out.println ("Nie wolno dzielic przez 0");
        } catch (IndexOutOfBoundsException exc1) {
            System.out.println ("Przekroczono index tablicy");
        }


    }
}

