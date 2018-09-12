package GenericsType.Queue;

public class QueueGenDemo {
    public static void main(String args[]) {
        Integer iQueue[] = new Integer[10];

        QueueGen<Integer> q = new QueueGen<>(iQueue);

        Integer iVal;

        System.out.println("Kolejka integer: ");
        try {
            for (int i=0; i<5; i++) {
                System.out.println("Wstawianie " + i + " do kolejki q");
                q.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Pobieranie elementy typu Integer z kolejki q ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        Double dQueue[] = new Double[10];

        QueueGen<Double> q2 = new QueueGen<>(dQueue);

        Double dVal;

        System.out.println("kolejka Double: ");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Wstawianie: " + (double) i / 2 + " do kolejki q2.");
                q2.put((double)i / 2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Pobieranie elementu typu Double z kolejki q2 ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }


    }
}
