class Vehicle {
    private int passangers;
    private int fuelcap;
    private double lkm;

    Vehicle(int p, int f, double l){
        passangers = p;
        fuelcap = f;
        lkm = l;
    }

    int range(){
        return (int)(fuelcap / lkm*100);
    }

    double fuelneeded(int km){
        return (double) km / 100 * lkm;
    }

    int getPassangers() {
        return passangers;
    }
    void setPassangers(int p) {
        passangers = p;
    }

    int getFuelcap(){
        return fuelcap;
    }

    void setFuelcap(int f){
        fuelcap = f;
    }

    double getLkm() {
        return lkm;
    }

    void setMpg(double l){
        lkm = l;
    }


}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, double l, int c){
        super(p, f, l);

        cargocap = c;
    }

    int getCargo(){
        return cargocap;
    }

    void putCargo(int c){
        cargocap = c;
    }
}


public class TruckDemo {
    public static void main(String args[]){
        Truck semi = new Truck (2,200,25,4);
        Truck pickup = new Truck (3,77,11,2);
        double liters;
        int dist = 252;

        liters = semi.fuelneeded (dist);

        System.out.println ("polciezarowka przewozi: " + semi.getCargo ( ) + " tony ladunku " +
                "\nAby pokonac dystans " + dist + "km potrzebuje : " + liters + " listrow paliwa.\n");
        liters = pickup.fuelneeded (dist);
        System.out.println (" Pickup przewozi " + pickup.getCargo ( ) + "tone ladunku ");

        System.out.println ("Aby pokonac dystans " + dist + " km pickap potrzebuje : " + liters + " litrow paliwa");

    }
}
