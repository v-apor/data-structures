public class Driver{
    public static void main(String[] args){
        LinkedList llst = new LinkedList();
        llst.addLast(14);
        llst.addFirst(16);
        llst.addLast(75);
        llst.addLast(750);
        llst.showElements();
        llst.addAt(1, 61);
        llst.addAt(14, 61);
        //llst.addAt(4, 61);
        //llst.addLast(100);
        llst.showElements();
        llst.deleteFrom(3);
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