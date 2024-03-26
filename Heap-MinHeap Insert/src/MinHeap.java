import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int i) {
        heap.add(i);
        int index = heap.size()-1;
        while (i < heap.get(parent(index))) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void sinkDown(int index) {
        int minIndex = index;
        while (true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if (leftIndex < heap.size() && heap.get(leftIndex) < heap.get(minIndex)) {
                minIndex = leftIndex;
            }

            if (rightIndex < heap.size() && heap.get(rightIndex) < heap.get(minIndex)) {
                minIndex = rightIndex;
            }

            if (minIndex != index) {
                swap(index, minIndex);
                index = minIndex;
            } else {
                return;
            }
        }
    }

    public Integer remove() {
        if (heap.isEmpty()) return null;
        int removed;
        if (heap.size() == 1) {
            removed = heap.remove(0);
            return removed;
        }
        swap(0, heap.size()-1);
        removed = heap.remove(heap.size()-1);
        sinkDown(0);
        return removed;
    }

    // WRITE THE INSERT METHOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////

}
