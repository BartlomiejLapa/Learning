package GenericsType.Queue;

class QueueGen<T> implements QueuePutSet<T> {
    private T q[];
    private int putloc, getloc;

    public QueueGen(T aRef[]) {
        q = aRef;
        putloc = getloc = 0;
    }

    @Override
    public void put(T ch) throws QueueFullException {
        if (putloc == q.length-1) throw new QueueFullException(q.length-1);
        putloc++;
        q[putloc] = ch;
    }



    @Override
    public T get() throws QueueEmptyException {
        if(getloc == putloc) throw new QueueEmptyException();
        getloc++;
        return q[getloc];
    }
}

