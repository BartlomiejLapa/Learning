package typyWyliczeniowe;


public class EnumDemo2 {
    public static void main(String args[]) {
        Transport transport1, transport2, transport3;

        System.out.println("stałe wyliczeniowe typu Transport z wartościami porządkowymi: ");
        for (Transport t : Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        transport1 = Transport.AIRPLANE;
        transport2 = Transport.CAR;
        transport3 = Transport.FERRY;

        System.out.println();

        if (transport1.compareTo(transport2) < 0) {
            System.out.println(transport1 + " znajduje się przed 0" + transport2 + " na liscie");
        } else if (transport1.compareTo(transport2) == 0) {
            System.out.println("Ma tą samą wartość porządkową");
        } else System.out.println(transport1 + " znajduje się za " + transport2 + " na liscie");

    }
}
