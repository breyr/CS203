package coderecall;

public class Node {
    private Object item;
    private Node next;

    public Node() {
        item = null;
        next = null;
    }

    public Node(Object obj) {
        this.item = obj;
        next = null;
    }

    public Object getItem() {
        return this.item;
    }

    public void setItem(Object obj) {
        this.item = obj;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node n) {
        this.next = n;
    }
}
