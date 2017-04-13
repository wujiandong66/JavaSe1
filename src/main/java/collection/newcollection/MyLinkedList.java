package collection.newcollection;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
public class MyLinkedList {

    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {
    }

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
//        System.out.println(myLinkedList.first());
//        System.out.println(myLinkedList.last());
//        System.out.println(myLinkedList.get(1));
//        System.out.println(myLinkedList.size());
//        myLinkedList.remove(1);
//        myLinkedList.remove(1);
//        myLinkedList.remove(0);
        System.out.println(myLinkedList); // c
    }

    public String remove(int index) {
        Node node = getNode(index);
        String element = node.element;
        Node prev = node.prev;
        Node next = node.next;
        if (prev == null && next == null) {
            node.element = null;
        } else if (prev == null) {
            first = next;
            next.prev = null;
            node.next = null;
            node.element = null;
        } else if (next == null) {
            last = prev;
            prev.next = null;
            node.prev = null;
            node.element = null;
        } else {
            prev.next = next;
            next.prev = prev;
            node.prev = null;
            node.next = null;
            node.element = null;
        }
        size--;
        return element;
    }
/*
   [0]---[1]---[2]---[?].............[n?]
 */

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++) {
            String element = get(i);
            s += element;
            if (i != size - 1) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

    public int size() {
        return size;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public String get(int index) {
        return getNode(index).element;
    }

    public boolean add(String element) {
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {
            Node node = new Node(element, last, null);
            last.next = node;
            last = node;
        }
        size++;
        return true;
    }

    public String first() {
        return first.element;
    }

    public String last() {
        return last.element;
    }

    private class Node { // node 节点\ [nəʊd]
        String element;
        Node prev; // prev previous 以前的\ ['priːvɪəs]
        Node next;

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}