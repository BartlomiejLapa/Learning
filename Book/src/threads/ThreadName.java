package threads;

class ThreadN implements Runnable {
    Thread thread;

    ThreadN(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {
        System.out.println(thread.getName() + " rozpoczyna działanie ");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(800);
                if(count ==5) thread.setName("nowa nazwa");
                System.out.println(thread.getName() + " jest wykonywany, licznik: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " został przerwany ");
        }
        System.out.println(thread.getName() + " konczy działanie ");
    }
}
public class ThreadName {
    public static void main(String args[]) {
        System.out.println("Głowny wątek rozpoczyna działąnie ");
        ThreadN asd = new ThreadN("Wąteczek  sroteczek");

        for(int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(400);
            } catch (InterruptedException exc) {
                System.out.println("Przerwanie wątka gównego");
            }
        }
        System.out.println("Wątek gówny kończy działąnie");
    }
}
