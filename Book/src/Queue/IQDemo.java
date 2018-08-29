package Queue;

import qpack.*;

class DynQueue extends Thread implements ICharQ  {
    String status;
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    @Override
    synchronized public void put(char ch) {

        if (putloc == q.length - 1) {
            char t[] = new char[q.length*2];
            for(int i=0; i<q.length;i++) {
                t[i]=q[i];
            }
            q = t;
        }
        putloc++;
        q[putloc] =ch;

        status ="puted";
        notify();
    }


    @Override
    synchronized public char get() {
        if (getloc == putloc) {
            System.out.println(" ### Kolejka pusta ###");
            return (char) 0;
        }
        getloc++;

        status = "geted";
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
        return q[getloc];
    }
}


public class IQDemo {
    public static void main(String args[]) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);


    ICharQ iQ;
    char ch;
    int i;

    iQ =q1;
    for (i=0; i<10; i++) iQ.put((char) ('A'+i));

        System.out.print("zaw kolejki o stalym rozmiarze: ");
        for (i=0; i<10; i++) {
            ch = iQ.get();
            System.out.print(ch + " ");
        }
        System.out.println();

        iQ = q2;
        for(i=0; i<10; i++) {
            iQ.put((char) ('Z' - i));
        }

        System.out.print("Zawartosc kolejki dymanicznej: ");
        for(i=0; i <10; i++) {
            ch = iQ.get();
            System.out.print(ch + " ");
        }
        System.out.println();

        iQ=q3;
        for(i=0; i <10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.print("Zawartosc kolejki cyklicznej: ");
        for(i=0; i<10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nUmieszcza znak i pobiera z kolejki cyklicznej");

        for(i=0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
