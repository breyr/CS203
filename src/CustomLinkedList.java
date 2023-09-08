// Having class here is not best practice
class Node {
    Object item;
    Node next;

    public Node() {
        item = null;
        next = null;
    }

    public Node(Object item) {
        this.item = item;
    }

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}

public class CustomLinkedList {
    private Node head;
    private int size;

    public CustomLinkedList() {
        head = new Node();
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.item;
    }

    // Add the end of the list
    public void add(Object obj) {
        // Verify if we already have an item in the list
        if (size == 0 /* head.next == null */) {
            Node n = new Node(obj);
            // head points to n, since head exists outside of this scope the object at n
            // will not be destroyed until head is destroyed
            head.next = n;
        } else { // add the item if we already have an item in the list
            Node n = new Node(obj);
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
        }
    }

    public void replace(Object obj, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.item = obj;
    }

    public static void main(String[] args) {

    }
}