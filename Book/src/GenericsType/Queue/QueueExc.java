package GenericsType.Queue;

class QueueFullException extends Exception {
    int size;

    QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "\n## Kolejka pelna. Max rozmiar kolejki: " + size;
    }
}

class QueueEmptyException extends Exception {

    public String toString() {
        return "\n## kolejka pusta";
    }
}
