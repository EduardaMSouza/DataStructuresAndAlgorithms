import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        ArrayList<Integer> stackList = stack.getStackList();
        ArrayList<Integer> sortedList = new ArrayList<>();
        int stackSize = stack.size();
        for (int i = stackSize-1; i >= 0;i--) {
            int greater = stackList.get(i);
            for (int y = 0; y < stackList.size();y++) {
                int comparison = stackList.get(y);
                if (comparison > greater) {
                    greater = comparison;
                }
            }
            int index = stackList.indexOf(greater);
            stackList.remove(index);
            sortedList.add(greater);
        }
        while (!stack.isEmpty()) {
            stack.pop();
        }
        for (int i = 0; i < sortedList.size();i++) {
            stack.push(sortedList.get(i));
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }

}

