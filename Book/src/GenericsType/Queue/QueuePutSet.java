package GenericsType.Queue;

public interface QueuePutSet <T> {
    void put(T ch) throws QueueFullException;

    T get() throws QueueEmptyException;
}
