package samples.leetcode.fb.queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueRemoval {

    class Pair {

        public int value;
        public int index;
        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    int[] findPositions(int[] arr, int x) {
        // Write your code here
        Queue<Pair> queue = new LinkedList<>();
        int[] res = new int[x];

        for (int i=0;i<arr.length;i++) {
            int value = arr[i];
            queue.add(new Pair(value, i));
        }


        for (int iteration = 0; iteration < x; iteration++) {
            List<Pair> elements = popElements(queue, x);
            int maxIdx = findIndexOfMax(elements);
            res[iteration] = elements.get(maxIdx).index + 1;
            elements.remove(maxIdx);
            processAndAdd(elements, queue);
        }

        return res;
    }

    List<Pair> popElements(Queue<Pair> queue, int count) {
        List<Pair> elements = new ArrayList<>();
        while (count > 0 && !queue.isEmpty()) {
            elements.add(queue.poll());
            count--;
        }

        return elements;
    }

    int findIndexOfMax(List<Pair> elements) {
        // this can live inside the popElementsFunction, kept here for neatness but adds N extra work
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i=0; i < elements.size(); i++) {
            if (elements.get(i).value > max) {
                max = elements.get(i).value;
                idx = i;
            }
        }

        return idx;
    }

    void processAndAdd(List<Pair> elements, Queue<Pair> queue) {
        elements.forEach(element -> {
            if (element.value != 0) {
                --element.value;
            }
            queue.add(element);
        });
    }

}
