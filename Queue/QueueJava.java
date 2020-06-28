import java.util.LinkedList;
import java.util.Queue;
public class QueueJava{
    public static void main(String[] args){
        Queue q = new LinkedList();              //Note we need LL cos Queue is just interface
        // adding/enqueing element from queue
        q.add("A");
        q.add("P");
        System.out.println(q);
        //removing element/ deque from queue 
        System.out.println(q.remove());
        System.out.println(q.remove());
        //System.out.println(q.remove());    
        // note remove() throws exception if no elements present
        // if we want to return null if queue is empty we use poll()
        System.out.println(q.poll());
                
    }
}