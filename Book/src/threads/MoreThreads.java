package threads;

class MyThread2 implements Runnable {
    Thread thrd;

    MyThread2(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }
    @Override
    public void run() {
        System.out.println(thrd.getName() + " rozpoczna działanie ");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(thrd.getName() + " jest wykonywany " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println("Przerwanie wątki wewnetrznego:" + thrd.getName());
        }
        System.out.println("Zakonczenie dzialania wątki wewnetrznego " + thrd.getName());
    }
}

public class MoreThreads {
    public static void main(String args[]) {
        System.out.println("Głowny watek");
        MyThread2 mt[] = new MyThread2[4];

        for(int i=0; i<mt.length; i++) {
        mt[i] = new MyThread2("Wątek nr" + i);
        }



        for (int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Przerwanie wątku zewnętrznego");
            }
            System.out.println("Koniec wątku wewnętrznego");
        }
    }
}
