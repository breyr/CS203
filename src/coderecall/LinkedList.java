package coderecall;

public class LinkedList {
    // LinkedList has a head and a tail
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public String toString() {
        String out = "";
        for (Node n = head; n != null; n = n.getNext())
            out += n.getItem() + " ";

        return out;
    }

    // Add to end of a LinkedList
    public void add(Object obj) {
        Node n = new Node(obj);
        if (head == null && tail == null) {
            // then list is empty, set head to n
            head = n;
            tail = n;
        } else {
            // update tail
            // tail points to the current last node, so if you set the next of that node to
            // the new node then update tail the node will be added to the end
            tail.setNext(n);
            tail = n;
        }
        size++;
    }

    // Add at specified position
    public void add(int position, Object obj) throws Exception {
        // have to check position is in valid range
        if (position < 0 || position > size - 1) {
            throw new Exception(position + " out of bounds");
        } else {
            Node n = new Node(obj);
            Node curr = head;
            Node prev = null;
            int count = 0;
            // while the current node exists
            while (curr != null) {
                if (count == position) {
                    // at index to add element
                    // check if prev is null, if so update head
                    if (prev == null) {
                        head = n;
                        head.setNext(curr);
                    } else if (curr.getNext() == null) {
                        prev.setNext(n);
                        n.setNext(tail);
                    } else {
                        // add between prev and curr
                        prev.setNext(n);
                        n.setNext(curr);
                    }
                    break;
                }

                prev = curr;
                curr = curr.getNext();
                count++;
            }
            size++;
        }
    }

    // remove at specified position
    public void remove(int position) throws Exception {
        // have to check position is in valid range
        if (position < 0 || position > size - 1) {
            throw new Exception(position + " out of bounds");
        } else {
            Node curr = head;
            Node prev = null;
            int count = 0;
            // has to be less than, if <= then curr.getNext() will be the element after the
            // node in which we want to remove
            for (; count < position; count++) {
                prev = curr;
                curr = curr.getNext();
            }
            // at position to remove curr, update prev.next to point to curr.next
            // essentially removing curr
            prev.setNext(curr.getNext());
            size--;
        }
    }

    // remove specified object (first occurence)
    // return the position of remove obj, -1 if not found
    public int remove(Object obj) {
        Node curr = head;
        Node prev = null;
        int pos = 0;

        // while current element is not null
        while (curr != null) {
            // check to see if we found the object
            if (curr.getItem().equals(obj)) {
                prev.setNext(curr.getNext());
                return pos;
            }
            prev = curr;
            curr = curr.getNext();
            pos++;
        }
        size--;
        return -1;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        try {
            list.add(0, "5");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            list.remove(2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(list.remove("3"));
        System.out.println(list.toString());
    }
}
