public class BinarySearchTree {

    private Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    // WRITE THE RECURSIVE CONTAINS METHOD HERE //
    //                                          //
    //                                          //
    //                                          //
    //                                          //
    //////////////////////////////////////////////

    public boolean rContains(int value) { return rContains(root, value); }

    private boolean rContains(Node root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        if (value < root.value) {
            return rContains(root.left, value);
        }else {
            return rContains(root.right, value);
        }
    }

}

