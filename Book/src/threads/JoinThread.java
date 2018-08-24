package threads;

class MyJoin implements Runnable {
    Thread thrd;

    MyJoin(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }
    @Override
    public void run() {
        System.out.println("Wątek ##" + thrd.getName() + "## rozpoczyna dzialanie!");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(thrd.getName() + " liczynik: " + count);

            }
        } catch (InterruptedException exc) {
            System.out.println("Wątek " + thrd.getName() + "został przerwany ");
        }
        System.out.println(thrd.getName() + " konczy dzialanie.");
    }
}
public class JoinThread {
    public static void main(String args[]) {
        System.out.println("Glowny watek rozpoczyna dzialanie");

        MyJoin mt1 = new MyJoin("Watek potomny nr 1");
        MyJoin mt2 = new MyJoin("Watek potomny nr 2");
        MyJoin mt3 = new MyJoin("Watek potomny nr 3");

        try {
            mt1.thrd.join();
            System.out.println("###Watek P nr 1 zakonczyl dzialanie");
            mt2.thrd.join();
            System.out.println("###Watek P nr 2 zakonczyl dzialanie");
            mt3.thrd.join();
            System.out.println("###Watek P nr 3 zakonczyl dzialanie");
        } catch (InterruptedException exc) {
            System.out.println("Watek glowny zostal przerwany#$@$$@$");
        }
        System.out.println("Wątek głowny zakonczył działanie");
    }
}
