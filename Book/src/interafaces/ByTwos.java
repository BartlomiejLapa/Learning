package interafaces;

public class ByTwos implements Series {
    int start;
    int val;

    ByTwos(){
        start = val = 0;
    }

    public int getNext(){
        val +=2;
        return val;
    }

    public void reset(){
        val = start;
    }

    public void setStart(int x){
        start = val = x;
    }
}

class ByThrees implements Series {
    int start;
    int val;

    ByThrees(){
        start = val = 0;
    }


    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        val = start;
    }

    @Override
    public void setStart(int x) {
        start = val = x;

    }
}
