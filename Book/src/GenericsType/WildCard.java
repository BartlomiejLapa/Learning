package GenericsType;

class Numerics<T extends Number>{
    T num;

    Numerics(T num) {
        this.num = num;
    }

    double reciprocal() {
        return  1 / num.doubleValue();
    }

    double fraction() {
        return  num.doubleValue() - num.intValue();
    }

    boolean absEqual(Numerics<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;
        return false;
     }
}

public class WildCard {
    public static void main(String args[]) {
        Numerics<Integer> obj1 = new Numerics<Integer>(66);
        Numerics<Double> obj2 = new Numerics<Double>(-66.00);
        Numerics<Long> obj3 = new Numerics<Long>(5L);

        System.out.println("Sprawdzenie obj1 i obj2");
        if(obj1.absEqual(obj2)) System.out.println("Wartosci bezwzgledne sa takie same");
        else System.out.println("Wartosci bezwzgledne sa rozne");

        System.out.println("\nSprawdzenie obj1 i obj3");
        if(obj1.absEqual(obj3)) System.out.println("Wartosci bezwzgledne sa takie same");
        else System.out.println("Wartosci bezwzgledne sa rozne");

    }
}
