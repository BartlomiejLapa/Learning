package exceptions;

class NonIntResultException extends Exception {
    int n, d;

    public NonIntResultException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public String toString(){
        return "Wynik dzielenia " + n + " / " + d + " nie jest wartoscia calkowita";
    }
}

public class CustomExcept {
    public static void main(String args[]) {
        int number[] = new int[9];
        int denom[] = {2, 0, 4, 4, 8};

        number[0]=2;
        for (int i=1; i<number.length;i++) {
            number[i]=2*number[i-1];
        }
        number[3] = 15;

        for (int i=0; i < number.length; i++) {
            try {
                if ((number[i] % 2) != 0) throw new NonIntResultException(number[i], denom[i]);

                System.out.println(number[i] + " / " + denom[i] + " = " + number[i] / denom[i]);

            } catch (ArithmeticException exc) {
                System.out.println("wykryto dzielenie przez 0");

            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Przekroczony indeks tablicy");
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }

    }
}
