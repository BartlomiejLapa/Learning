class Queue {
    char q[];
    char putloc, getloc;

    Queue (int size){
        q = new char [size+1];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println (" -- kolejka pełna.");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println (" -- kolejka pusta.");
            return (int) 0;
        }
        getloc++;
        return q[getloc];
    }

}

class QDemo {
    public static void main(String args []) {
        Queue bigQ = new Queue (100);
        Queue smallQ = new Queue (4);
        char ch;
        int i;

        System.out.println ("Używam kolejki bigQ do przehowywania alfabetu.");
        for (i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        System.out.println ("Zawartosc kolejki bigQ: ");
        for (i=0; i < 26; i++){
            ch = bigQ.get ();
            if (ch != (char) 0) System.out.print (ch);
        }
        System.out.println ("\n");

        System.out.println ("Uzywam kolejnki smallQ do wygenerowania błędów.");
        for (i=0; i < 5; i++){
            System.out.println ("Próbuję umieścić w kolejce znak " + (char) ('A' - i));
            smallQ.put((char)('A' -i));

        }
        System.out.println ();
        System.out.println ("Zawartosc kolejki smallQ:");
        for (i=0 ; i < 5; i++){
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print (ch);
        }
    }

}
