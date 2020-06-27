public class Driver{
    public static void main(String[] args){
        LinkedList llst = new LinkedList();
        llst.addLast(14);
        llst.addFirst(12);
        //llst.addLast(100);
        llst.showElements();
        //llst.deleteLast();
        //llst.showElements();
        //llst.deleteLast();
        //llst.deleteFirst();
        //llst.showElements();
        System.out.println("size: " + llst.size());
        System.out.println(llst.contains(14));
        System.out.println(llst.indexOf(14));
    }
}