import java.util.Arrays;

public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T> {
    //This implementation is similar to the LinkedList implementation of the List,
    // with the exception that the add function maintains the contained items in sorted order.
    // Your implementation of the SortedLinkedList may use any of the variants of a LinkedList
    // (eg. dummy head, circular, doubly-linked) we discussed.

    //declaring LinkedList Attributes
    class Node<T> {
        //no functions nessesary
        //holding the actual info
        T data;
        //pointer to the next node
        Node<T> next;

        //Constructor for Node
        public Node(Object value) {
            data = (T) value;
            next = null;
        }
    }

    Node<T> head;
    int size;

    //Understanding LinkedList: the linked list needs to ask the individual node to get its next thing and the linked list itself is just
    //gonna move over a bunch of nodes to get to the right node

    public SortedLinkedList() { //Constructor
        //Making the LinkedList start empty
        //head is the first node
        head = null;
        size = 0;
    }

    @Override
    public boolean add(T Comparable) {
        //if List is empty, create new node and set it to head
        if (head == null) {
            head = new Node(Comparable);
            ++size;
            return true;
        }

        int counter = size - 1;
        Node prev = new Node(Comparable);


        while (counter >= 0 && head.data.compareTo(Comparable) > 0) {

            prev = prev.next;

            //Create new node with Comparable item in it.
            Node node = new Node(Comparable);
            //Link that new node with the rest of the list
            node.next = prev;

            //Node prev = head;

            prev.next = node;

        }
        size++;


        return true;

    }

    @Override
    public T remove(int pos) {
        if (pos == 0) {
            Node node = head;
            head = head.next;
            --size;
            return (T) node.data;
        } else {
            Node prev = head;
            for (int i = 0; i < pos - 1; i++) {
                prev = prev.next;
            }
            Node node = prev.next;
            prev.next = node.next;
            --size;
            return (T) node.data;
        }
    }


    @Override
    public T get(int pos) {

        Node current = head;

        for (int i = 0; i < pos; i++) {
            current = current.next;

        }
        return (T) current.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}



