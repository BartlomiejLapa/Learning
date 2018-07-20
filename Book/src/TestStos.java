class TestStack {
    char q[];
    int pop, push;

    TestStack(int size){
        q = new char [size];
        pop = q.length - 1;
        push = -1;
    }

    void put(char ch) {
        if (pop == -1) {
            System.out.println (" -- stos pełny.");
            return;
        }
        q[pop] = ch;
        pop--;
    }

    char get() {
        if (push == q.length - 1) {
            System.out.println (" -- stos pusty.");
            return (int) 0;
        }
        push++;
        return q[push];


    }

}

class TestStos {
    public static void main(String args []) {
        TestStack bigQ = new TestStack (26);
        char ch;
        int i;

        System.out.println ("Używam stosu bigQ do przehowywania alfabetu.");
        for (i=0; i < bigQ.q.length; i++)
            bigQ.put((char) ('A' + i));
        System.out.println ("Zawartosc stosu bigQ: ");
        for (i=0; i < bigQ.q.length; i++){
            ch = bigQ.get ();
            if (ch != (char) 0) System.out.print (ch + " ");
        }
        System.out.println ("\n");


    }

}

