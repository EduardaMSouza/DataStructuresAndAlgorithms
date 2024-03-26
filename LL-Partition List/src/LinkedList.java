public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int x){
        if (this.length <= 1) return;
        Node temp = head;
        Node minorList = null;
        Node minorListHead = null;
        int minorCount = 0;
        Node greaterList = null;
        Node greaterListHead = null;
        int greaterCount = 0;
        while (temp != null) {
            if (temp.value < x) {
                if (minorCount == 0) {
                    minorListHead = temp;
                    minorList = temp;
                } else {
                    minorList.next = temp;
                    minorList = minorList.next;
                }
                minorCount++;
            } else {
                System.out.println("Entrei: "+ temp);
                if (greaterCount == 0) {
                    greaterListHead = temp;
                    greaterList = greaterListHead;
                } else {
                    greaterList.next = temp;
                    greaterList = greaterList.next;
                }
                greaterCount++;
            }
            temp = temp.next;
            System.out.println("Temp:" + greaterListHead);
        }
        if (minorCount == 0) {
            head = greaterListHead;
            greaterList.next = null;
            return;
        }
        if (greaterCount == 0) {
            head = minorListHead;
            minorList.next = null;
            return;
        }
        head = minorListHead;
        minorList.next = greaterListHead;
        greaterList.next = null;
    }
}

