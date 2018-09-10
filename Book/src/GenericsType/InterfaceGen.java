package GenericsType;

interface Containment<T extends Number> {
    boolean contains(T o);
}

class InterClass<T extends Number> implements Containment<T> {
    T[] arrayRef;

    InterClass(T[] o) {
        arrayRef = o;
    }

    @Override
    public boolean contains(T o) {
        for (T x : arrayRef) {
            if(x.equals(o)) return true;
        }
        return false;
    }
}

public class InterfaceGen {
    public static void main(String argsp[]) {
        Integer x[] = {1, 2, 3};

        InterClass<Integer> ob = new InterClass<>(x);

        if (ob.contains(2)) {
            System.out.println("ob zawiera 2");
        } else System.out.println("ob nie zawiera 2");

        if (ob.contains(5)) {
            System.out.println("ob zawiera 5");
        } else  System.out.println("ob nie zawiera 5");
    }
}
