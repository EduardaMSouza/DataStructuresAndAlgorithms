public class DoublyLinkedList {

    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        this.length++;
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
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            this.length++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
        this.length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node removedNode;
        if (length == 1) {
            removedNode = head;
            head = null;
            tail = null;
            this.length--;
            return removedNode;
        }
        removedNode = tail;
        this.tail = this.tail.prev;
        this.tail.next = null;
        this.length--;
        return removedNode;
    }

    public void prepend(int value) {
        if (length == 0) {
            append(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        this.length++;
    }

    public Node removeFirst() {
        if (length == 1) {
            return removeLast();
        }
        if (length == 0) return null;
        Node removedNode;
        removedNode = head;
        head = head.next;
        head.prev = null;
        this.length--;
        return removedNode;
    }

    public Node get(int index) {
        if (length == 0 || index < 0 || index > length) return null;
        Node temp;
        if (index >= (length/2)) {
            temp = tail;
            for (int i = 1;i < (length-index); i++) {
                temp = temp.prev;
            }
        }else {
            temp = head;
            for (int i = 1;i <= index; i++) {
                temp = temp.next;
            }
        }

        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp == null) return false;
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (length == index) {
            append(value);
            return true;
        }
        Node temp = get(index);
        if (temp == null) return false;
        Node newNode = new Node(value);
        temp.prev.next = newNode ;
        newNode.prev = temp.prev;
        newNode.next = temp;
        temp.prev = newNode;
        this.length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length-1) return removeLast();
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        this.length--;
        return temp;
    }

}

