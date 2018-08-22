package threads;

class MyThread implements Runnable {
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Rozpoączecie działania wątku pobocznego " + name + " start ");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(300);
                System.out.println(name + " wartosc licznika: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.print(name + " zostal przerwany!");
        }
        System.out.println(name + " zakonczyl dzialanie.");
    }
}
public class SleepThreads {
    public static void main(String args[]) {
        System.out.println("Rozpoczącie dzialania wątku głównego");

        MyThread myThread = new MyThread("Wątek potomny nr 1 ");
        Thread newThread = new Thread(myThread);

        newThread.start();
        for (int i=0; i<100; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Przerwanie wątku głównego");
            }
        }
        System.out.println("Zakonczenie dzialania wątku głównego");
    }
}
