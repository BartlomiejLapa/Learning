package exceptions.Queue;

class QueueFullException extends Exception {
    int size;

    QueueFullException(int size) {

        this.size = size;
    }

    public String toString() {
        return "\nKolejka pelna. Maksymalny rozmiar kolejki: " + size;
    }
}

class QueueEmptyException extends Exception {

    public String toString() {
        return "\nKolejka pusta.";
    }
}

class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    FixedQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if (putloc == q.length - 1) throw new QueueFullException(q.length-1);

        putloc++;
        q[putloc] = ch;
    }

    public char get() throws QueueEmptyException {
        if (getloc == putloc) throw new QueueEmptyException();

        getloc++;
        return q[getloc];
    }
}


public class QExc {
    public static void main(String args[]) {
        int size = 12;

        FixedQueue kłueue = new FixedQueue(size);

        System.out.println("Wstawiam znak do kolejki: ");
        for(int i=0; i<size+1; i++) {
            try {
                System.out.print((char)('A' + i) + " ");
                kłueue.put((char) ('A' + i));
            } catch (QueueFullException exc) {
                System.out.println("\n### Kolejka pełna");
            }
        }

        System.out.println();
        System.out.println("Pobieram znak z kolejki: ");
        for (int i=0; i<size+1; i++) {
            char ch;
            try {
                ch = kłueue.get();
                System.out.print(ch + " ");
            } catch (QueueEmptyException exc) {
                System.out.println("\n### Kolejka pusta");
            }
        }

        }

    }

interface ICharQ{
    void put(char ch) throws QueueFullException;
}

