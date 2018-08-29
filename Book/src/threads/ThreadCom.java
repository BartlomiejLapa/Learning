package threads;

class TicTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }

        System.out.print("tik ");
        state = "ticked";
        notify();

        try {
            while (!state.equals("tocked")) {
                Thread.sleep(500);
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Wątek został przerwany.");
        }

    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }

        System.out.println("tock");
        state = "tocked";
        notify();

        try {
            while (!state.equals("ticked")) {
                Thread.sleep(500);
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Wątek przerwany zosatał");
        }
    }
}

class MyThreadCom implements Runnable{
    Thread thrd;
    TicTock tt0b;

    MyThreadCom(String name, TicTock tt) {
        thrd = new Thread(this, name);
        tt0b = tt;
        thrd.start();

    }

    public void run() {

        if (thrd.getName().compareTo("tick") == 0) {
            for (int i = 0; i < 10; i++) tt0b.tick(true);
            tt0b.tick(false);

        } else {
            for (int i = 0; i < 10; i++) tt0b.tock(true);
            tt0b.tock(false);
        }
    }
}
public class ThreadCom {
    public static void main(String args[]) {
        TicTock tt = new TicTock();
        MyThreadCom mt1 = new MyThreadCom("tick", tt);
        MyThreadCom mt2 = new MyThreadCom("tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Wątek główny został przerwany.");
        }
    }
}
