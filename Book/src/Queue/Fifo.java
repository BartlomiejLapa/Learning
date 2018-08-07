package Queue;
class Queue {
    private Node first;
    private Node last;
    private int N;

    private class Node{
        char item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }
    public int size() {
        return N;
    }

    public void enqueue (char item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first = last;
        else oldlast.next = last;
        N++;
    }

    public char dequeue(){
        char item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }
}


public class Fifo {
    public static void main(String args[]){

    }
}
