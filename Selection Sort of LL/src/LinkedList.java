public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public void selectionSort() {
        if (length < 2) return;
        Node sortedUntil = head;
        Node minNode = head;
        for (int i = length;i > 0;i--) {
            Node currentNode = sortedUntil.next;
            minNode = sortedUntil;
            for (int y = 1;y < i;y++) {
                if (currentNode.value < minNode.value) {
                   minNode = currentNode;
                }
                currentNode = currentNode.next;
            }
            if (sortedUntil.value > minNode.value) {
                int temp = sortedUntil.value;
                sortedUntil.value = minNode.value;
                minNode.value = temp;
            }
            System.out.println("List printed: ");
            printList();
            sortedUntil = sortedUntil.next;
        }
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // WRITE SELECTIONSORT METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////

}