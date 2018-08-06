package Queue;

public class CircularQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size];
        putloc = 0;
        getloc = -1;
    }


    @Override
    public void put(char ch) {
        if(putloc == q.length-1) {
            System.out.println("Kolejka pelna");
            return; /* na chuj ten return tu?!!? ##@!#!@ */
        }
        q[putloc] = ch;
        putloc++;

    }

    @Override
    public char get() {
        if(putloc)
        return 0;
    }
}
