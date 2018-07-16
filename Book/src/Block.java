class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    boolean sameBlock(Block obz){
        if((obz.a == a) & (obz.b == b) & (obz.c == c)) return true;
        else return false;
    }

    boolean sameVolume (Block ob) {
        if (ob.volume == volume) return true;
        else return false;
    }

}

class PassOb {
    public static void main (String args[]){
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block (10, 2, 5);
        Block ob3 = new Block (4, 5, 5);

        System.out.println ("ob ma takie same rozmiary jak ob2: " + ob1.sameBlock (ob2) + "\n" +
                "ob1 ma takei same rozmiary jak ob3: " + ob1.sameBlock (ob3) + "\n" +
        "ob1 ma taka sama objetosc jak ob3: " + ob1.sameVolume (ob3));
    }
}
