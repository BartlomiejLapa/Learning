class Vehicle {
    int passengers;
    int fuelcap;
    double km;

    void range(){
        System.out.println("Zasięg w km: " + (int)(fuelcap / km * 100));
    }
}

class AddMeth {
    public static void main (String args[]){
        Vehicle minivan = new Vehicle ();
        Vehicle sportscar = new Vehicle ();

        minivan.passengers = 5;
        minivan.fuelcap = 38;
        minivan.km = 14;

        sportscar.passengers = 2;
        sportscar.fuelcap = 55;
        sportscar.km = 7.5;

        System.out.println ("Minivan przewozi: " + minivan.passengers + " osób. ");
        minivan.range();

        System.out.println ("Auto sportowe przewozi " + sportscar.passengers + " osób: ");
        sportscar.range ();
    }
}
