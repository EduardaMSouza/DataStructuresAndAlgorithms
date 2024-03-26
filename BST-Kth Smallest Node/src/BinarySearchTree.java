import java.util.ArrayList;
import java.util.Stack;


public class BinarySearchTree {

    private Node root;

    public Integer kthSmallest(int index) {
        if (root == null || index < 1) return null;
        ArrayList<Integer> values = new ArrayList<>();
        class Transversal{
            Transversal(Node currentNode) {
                if (currentNode.left != null) {
                    new Transversal(currentNode.left);
                }
                values.add(currentNode.value);
                if (currentNode.right != null) {
                    new Transversal(currentNode.right);
                }
            }
        }
        new Transversal(root);
        if (values.size() < index ) return null;
        return values.get(index-1);
    }

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
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



}
