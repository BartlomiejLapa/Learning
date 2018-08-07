package exceptions;

class ExcTest {
    static void genException(){
        int nums[] = new int[5];
        System.out.println ("Before generating exception: ");

        nums[11] = 2522;
        System.out.println ("Laalalalalaa ");
    }
}


public class ExcDemo {
    public static void main(String args[]) {
        try {
            ExcTest.genException ( );
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println ("Sprawdz indeks tabeli!");
        }
        System.out.println ("za catch lalala");
    }
}
