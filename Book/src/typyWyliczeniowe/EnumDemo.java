package typyWyliczeniowe;

enum Transport {
    AUTO(150), TIR(100), AIRPLANE(800), FERRY(120);

    private int speed;

    Transport(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }
}

public class EnumDemo {
    public static void main(String args[]) {
        Transport transport;

        System.out.println("Predkosc samochodu: " + Transport.AUTO.getSpeed() + "km/h");

        System.out.println("Prędkosc pojazdów: ");
        for (Transport t : Transport.values()) {
            System.out.println(t +": " + t.getSpeed() + "km/h");
        }
    }
}
