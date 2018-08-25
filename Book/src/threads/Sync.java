package threads;

class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]) {
        sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println(Thread.currentThread().getName() + " wyliczyl sume czesciowa rowna " + sum);

            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Wątek ##" + Thread.currentThread().getName() + "# został przerwany!");
            }
        }
        return sum;
    }
}

class MyThreadSync implements Runnable{
    Thread thrd;
    static SumArray sA = new SumArray();
    int a[], answer;

    MyThreadSync(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    public void run() {
        int sum;
        System.out.println(thrd.getName() + " rozpoczyna dzialanie!");
        answer = sA.sumArray(a);
        System.out.println(thrd.getName() + " wyliczył sumę równą " + answer);
        System.out.println(thrd.getName() + " konczy dzialanie");
    }
}

public class Sync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        MyThreadSync mt1 = new MyThreadSync("Wątek potomny nr 1 ", a);
        MyThreadSync mt2 = new MyThreadSync("Wątek potomny nr 2 ", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Wątek głowny został przerwany");
        }


    }
}
