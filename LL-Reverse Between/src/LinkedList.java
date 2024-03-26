public class LinkedList {

    private Node head;
    private int length;

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
        if (length == 0) {
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

    public void reverseBetween(int m, int n) {
        if (length <= 1 || (n-m) <= 0) return;
        Node temp = head;
        Node reverseList = null;
        int reverseCount = 0;
        int max = n;
        Node reverseHead = null;
        Node reversePre = null;
        Node tail = null;
        for (int i = 0; i <= (n-m);i++) {
            for (int y = 0;y < max;y++) {//4
                if (y == m-1 || m == 0) {
                    reversePre = temp;
                }
                temp = temp.next;
                if (y == max-1) {
                    if (reverseCount == 0) {
                        reverseList = temp;
                        reverseHead = reverseList;
                        tail = temp.next;
                    }else {
                        reverseList.next = temp;
                        reverseList = reverseList.next;
                    }
                    reverseCount++;
                }

            }
            temp = head;
            max--;
        }
        if (length == (n+1) && m == 0) {
            reverseList.next = head;
            reverseList.next.next = null;
            head = reverseHead;
        }else {
            reversePre.next = reverseHead;
            reverseList.next = tail;
        }
    }

}