class Test {
    int a, b;

    Test (int a, int b){
        this.a = a;
        this.b = b;
    }

    void change (Test ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
class PassObjRef {
    public static void main(String args[]){
        Test ob = new Test (20, 11);
        System.out.println ("ob.a i ob.b przed wywolaniem " + ob.a + " " + ob.b);
        ob.change (ob);
        System.out.println ("ob.a i ob.b po wywolaniu " + ob.a + " " + ob.b);
    }
}
