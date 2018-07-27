class A {
    A (){
        System.out.println ("Konstruktor A ");
    }
}

class B extends A {
    B(){
        System.out.println ("Konstruktor B ");
    }
}

class C extends B {
    C(){
        System.out.println ("Konstruktor C ");

    }
}

public class OrderOfConstruction {
    public static void main (String args[]){
        C c = new C();
    }
}
