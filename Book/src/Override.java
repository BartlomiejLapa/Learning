class Aa {
    int a,b;
    Aa( int a, int b){
        this.a = a;
        this.b = b;
    }

    void show(){
        System.out.println ("a i b : " + a + " i " + b);
    }

}

class Ba extends Aa {
    int c;

    Ba(int a, int b, int c){
        super(a, b);
        this.c = c;
    }

    void show(){
        super.show ();
        System.out.println (" c: " +c);
    }
}

public class Override {
    public static void main(String args[]){
        Ba SubOb = new Ba(1 ,2, 3);
        SubOb.show ();
    }
}
