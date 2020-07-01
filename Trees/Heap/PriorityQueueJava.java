import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueJava{
    public static void main(String[] args){
        // MinHeap used by default; use Collections.reverseOrder() for maxHeap
        PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder());
        // adding elements O(logN) b'cos we might need to rearrange the heap
        pQ.add(14);
        pQ.add(41);
        pQ.add(61);
        System.out.println(pQ);
        // peeking top/root/min value O(1)
        System.out.println(pQ.peek());
        System.out.println(pQ);
        // removing top/root/min value O(1)
        System.out.println(pQ.poll());
        System.out.println(pQ);
        // removing specific element O(N)
        pQ.remove(14);
        System.out.println(pQ);
        // lookup of priority queue O(N)
        System.out.println(pQ.contains(14));
        // convert to array
        Object[] arr = pQ.toArray();
        for(Object ele: arr){
            System.out.print(ele + " ");
        }
    }
}