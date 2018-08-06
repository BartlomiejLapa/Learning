package Queue;

public class FixedQueue implements ICharQ {
    private  char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = 0;
        getloc = -1;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("### Kolejka pelna ###");
            return;
        }

        q[putloc] = ch;
        putloc++;
    }

    @Override
    public char get() {
        if (getloc == putloc + 1) {
            System.out.println("### Kolejka pusta ###");
            return (char ) 0;
        }
        getloc++;
        return q[getloc];
    }
}
