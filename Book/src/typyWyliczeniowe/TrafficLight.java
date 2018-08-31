package typyWyliczeniowe;

enum TrafficLightColor {
    RED,
    YELLOW,
    GREEN
}

class TrafficLightSimulator implements Runnable {
    private Thread thrd;
    private TrafficLightColor color;
    boolean stop = false, changed = false;
    boolean ifGreen;

    TrafficLightSimulator(TrafficLightColor color) {
        this.color = color;
        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        this.color = TrafficLightColor.RED;
        thrd = new Thread(this);
        thrd.start();
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                thrd.setName("run");
                switch (color) {
                    case GREEN:
                        Thread.sleep(5000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(5000);
                        break;
                }
            } catch (InterruptedException exc) {
                System.out.println("Wątek zmiany swiatel został przerwany" + exc + " nazwa wątku: " + thrd.getName());
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        switch (color) {
            case RED:
                color = TrafficLightColor.YELLOW;
                ifGreen = false;
                break;
            case YELLOW:
                if (!ifGreen) {
                    color = TrafficLightColor.GREEN;
                } else color = TrafficLightColor.RED;
                break;
            case GREEN:
                color = TrafficLightColor.YELLOW;
                ifGreen = true;
        }
                changed = true;
                notify();
    }

    synchronized void waitForChange() {
        try {
            thrd.setName("waitForChange");
            while (!changed) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Wątek zmiany swiatel został przerwany" + exc + " nazwa wątku: " + thrd.getName() );
        }
    }
    synchronized TrafficLightColor getColor() {
        return color;
    }

    synchronized void cancel() {
        stop = true;
    }
}
public class TrafficLight {
    public static void main(String args[]) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.RED);

        for (int i=0; i <12; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
