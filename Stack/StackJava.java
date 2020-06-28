import java.util.Stack;
public class StackJava{
    public static void main(String[] args){
        Stack<Integer> stk = new Stack<Integer>();
        //pushing elements
        stk.push(14);
        stk.push(61);
        System.out.println(stk);
        //finding index of an element
        System.out.println("index: " + stk.search(61));
        System.out.println(stk);
        //returning top element (without deletion)
        System.out.println(stk.peek());
        System.out.println(stk);
        // return top element and delete it from stack
        System.out.println(stk.pop());
        System.out.println(stk);
        //check if stack is empty
        System.out.println(stk.empty());    // classic
        System.out.println(stk.pop());
        //check if stack is empty
        System.out.println(stk.isEmpty());  // added later with collection framework(use this!!)
    }
}