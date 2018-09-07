package GenericsType;

class Gen<Type> {

    Type ob;

        Gen(Type ob) {
            this.ob = ob;
        }

        Type getOb() {
            return ob;
        }

        void showType() {
            System.out.println("Typem Type jest " + ob.getClass().getName());
        }

}

class GenDemo {
    public static void main(String args[]) {
        Gen<Integer> integerOb;

        integerOb = new Gen<Integer>(69);

        integerOb.showType();

        int v = integerOb.getOb();
        System.out.println("wartosc:  " + v);

        Gen<String> stringOb = new Gen<String>("Test llalalaa");

        stringOb.showType();

        String str = stringOb.getOb();
        System.out.println("wartosc: " + str);

    }
}


