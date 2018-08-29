package threads;

class SuspendMyThread implements Runnable {
    boolean suspend = false;
    boolean stopped = false;
    Thread thrd;

    SuspendMyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " rozpoczyna działanie");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if (i % 10 == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
            }

            synchronized (this) {
                while (suspend) {
                    wait(); }
                if(stopped) return;
            }


        } catch (InterruptedException exc) {
            System.out.println("Wątek wewnętrzny został przerwany");
        }
        System.out.println(thrd.getName() + " konczy działanie");
    }

    synchronized void mystop() {
        stopped = true;
        suspend = false;
        notify();
    }

    synchronized void mysuspend() {
        suspend = true;
        notify();
    }

    synchronized void myresume() {
        suspend = false;
        notify();
    }


}
public class Suspend {
    public static void main(String args[]) {
        SuspendMyThread ob1 = new SuspendMyThread("Watek potomny" );

        try {
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Wstrzymuje watek");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("wznawiam watek");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Wstrzymuje watek");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("wznawiam watek");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("stopuje watek");
            ob1.mystop();
        } catch (InterruptedException exc) {
            System.out.println("Wątek został przerwany (Głowny)");
        }

        try {
            ob1.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("wątek główny został przerwany");
        }

        System.out.println("Wątek główny został zakonczony");

    }
}
