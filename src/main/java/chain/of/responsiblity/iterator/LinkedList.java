package chain.of.responsiblity.iterator;

/**
 * Created by AXT on 2017/10/25.
 */
public class LinkedList implements Collection,Iterator{
    Node head = null;
    Node tail = null;
    int size = 0;

    public void add(Object o){
        Node n = new Node(o, null);

        if(head == null) {
            head = n;
            tail = n;
        }

        tail.setNext(n);
        tail = n;
        size++;

    }
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
