import java.util.LinkedList;

public class LinkedListJava{
    public static void main(String[] args){
        LinkedList llst = new LinkedList();
        llst.addLast(61);
        llst.addLast(14);
        System.out.println(llst.contains(14));
        System.out.println(llst);
        llst.addFirst(75);
        System.out.println(llst);
        llst.remove(1);
        System.out.println(llst);
        llst.add(1, 101);
        System.out.println(llst);
        llst.set(2, 21);
        System.out.println(llst);
    }
}