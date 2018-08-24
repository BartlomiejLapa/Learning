package threads;

 class NewThread extends Thread {

     NewThread(String name) {
         super(name);
         start();
     }

     public void run() {
         System.out.println(getName() + " rozpoczyna działanie.");
         try {
             for(int count=0; count<10; count++) {
                 Thread.sleep(400);
                 System.out.println("Wątek o nazwie :\"" + getName() + "\" jest wykonywany: " + count + " raz.");

             }
         } catch (InterruptedException exc) {
             System.out.println("Przerwanie wątku: " + getName());
         }
         System.out.println("Wątek " + getName() + " został przerwany.");
     }

}
public class ExtendThread {
    public static void main(String args[]) {
        System.out.println("Rozpoczęcie działania głównego wątku.");
        NewThread nt = new NewThread("Wątek potomny1");

        for (int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Wątek głowny został przerwany");
            }
        }
        System.out.println("Zakończenie działąnia wątka głownego");
    }
}
