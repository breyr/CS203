
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

    /**
     * This method returns an object provided the index.
     * NOTE: it supports negative by applying the modulo operator to the index
     * 
     * @param index an integer that describes the item in an indexed list that you
     *              would like to get the value of
     * @return the object at the index provided
     * @throws Exception if the index is out of bounds
     */
    public Object get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds");
        }
        index = Math.floorMod(index, size); // supports any number, but not needed because we throw new Exception
        int counter = -1;
        Node n = head;
        do {
            counter++;
            n = n.next; // here because we need to skip the first node
            if (counter == index) {
                return n.item;
            }
        } while (counter != index);
        return null;
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
        size++;
    }

    public Object replace(int index, Object obj) {
        Node curr = head;
        int count = -1;
        while (count != index) {
            count++;
            curr = curr.next;
            if (count == index) {
                Object prevItem = curr.item;
                curr.item = obj;
                return prevItem;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.replace(0, 5));
        try {
            System.out.println(list.get(-2));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("I am here!");
    }
}