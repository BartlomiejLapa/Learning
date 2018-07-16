class Summation {
    int sum;

    Summation(int num){
        sum = 0;
        for (int i=1; i <= num; i++)
            sum += i;
    }

    Summation(Summation ob){
        sum = ob.sum;
    }
}

public class SumDemo {
    public static void main(String args[]){
        Summation t1 = new Summation (5);
        Summation t2 = new Summation (t1);

        System.out.println ("t1.sum: " + t1.sum + "\nt2.sum: " + t2.sum);

    }
}
